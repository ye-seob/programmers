import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별로 총 재생 횟수를 저장하는 맵
        Map<String, Integer> genrePlayCount = new HashMap<>();
        // 장르별로 노래 리스트를 저장하는 맵
        Map<String, List<Song>> genreSongs = new HashMap<>();
        
        // 각 곡에 대해 정보 저장
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + play);
            
            genreSongs.putIfAbsent(genre, new ArrayList<>());
            genreSongs.get(genre).add(new Song(i, play));
        }
        
        // 장르별로 총 재생 횟수를 기준으로 정렬
        List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
        sortedGenres.sort((g1, g2) -> genrePlayCount.get(g2) - genrePlayCount.get(g1));
        
        List<Integer> result = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<Song> songs = genreSongs.get(genre);
            
            // 장르 내에서 재생 횟수와 고유 번호로 정렬
            songs.sort((s1, s2) -> {
                if (s1.plays == s2.plays) {
                    return s1.id - s2.id; // 재생 횟수가 같으면 고유 번호 오름차순
                }
                return s2.plays - s1.plays; // 재생 횟수 내림차순
            });
            
            // 최대 2곡 추가
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                result.add(songs.get(i).id);
            }
        }
        
        // 결과를 int 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    // 노래 정보 저장용 클래스
    static class Song {
        int id;
        int plays;
        
        Song(int id, int plays) {
            this.id = id;
            this.plays = plays;
        }
    }
}
