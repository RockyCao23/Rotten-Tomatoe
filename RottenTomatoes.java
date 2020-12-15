public class RottenTomatoes {

        public static void main(String[] args) {

            int[][] ratings = { {2,10,9,10}, //infinity War
                                {9,3,4,8}, //La La Land
                                {9,6,10,7} };

            System.out.println("The Emoji Movie's average rating: " + movieAvgRating(ratings, 0));
            System.out.println("La La Land's average rating: " + movieAvgRating(ratings, 1));
            System.out.println("Barack Obama's average rating: " + reviewerAvgRating(ratings, 0));
            System.out.println("Leonardo DiCaprio's average rating: " + reviewerAvgRating(ratings, 1));
            System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));
            System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
            System.out.println("Worst movie is #" + worstMovie2018(ratings));
        }

        //Question 1
        public static int movieAvgRating(int[][] ratings, int movie) {

            int l = movie;
            int m = movie+1;
            double x = 0;
            double y = 0;
            int z = 0;

             for (int r = 0; r < ratings.length; r++) {
                 for (int c = l; c < m; c++) {

                     x = ratings[r][c];
                     y += x;

                 }z = (int) ((y / ratings.length));
             }
             return z;
        }

        //Question 2
        public static int reviewerAvgRating(int[][] ratings,int reviewer) {

            int x = 0;
            int y = 0;
            int z = 0;

            int r = reviewer;
                for (int c = 0; c < ratings[0].length; c++){
                    x = ratings[r][c];
                    y += x;
                    z = (int)((y/ratings[0].length));

                }return z;

        }

        //Question 3
        public static int avgRating2018(int[][] ratings) {

            int x = 0;
            int y = 0;
            int z = 0;

            for (int r = 0; r < ratings.length; r++){
                for (int c = 0; c < ratings[0].length; c++){
                    x = ratings[r][c];
                    y += x;

                }z = (int)(y/(ratings.length * ratings[0].length));
            }return z;

        }

        //Question 4
        public static int hardestReviewer2018(int[][] ratings) {
            double x = 0;
            double y = 0;
            double z = 0;
            double w = 100;
            int h = -1;

                for (int r = 0; r < ratings.length; r++){
                    for (int c = 0; c < ratings[0].length; c++) {

                        x = ratings[r][c];
                        y += x;

                    }z = (double) ((y / ratings[0].length));
                    if (z < w){
                        w = z;
                        h++;
                    }
                    y = 0;
                    x = 0;
                    z = 0;
            }return h;
        }

        //question 5
        public static int worstMovie2018(int[][] ratings) {

            double x = 0;
            double y = 0;
            double z = 0;
            double w = 100;
            int h = -1;

            for (int c = 0; c < ratings[0].length; c++) {
                for (int r = 0; r < ratings.length; r++){


                    x = ratings[r][c];
                    y += x;

                }z = (double) ((y / ratings.length));
                if (z < w){
                    w = z;
                    h++;
                }
                y = 0;
                x = 0;
                z = 0;
            }return h;
        }
    }

