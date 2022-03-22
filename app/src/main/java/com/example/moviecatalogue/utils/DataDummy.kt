package com.example.moviecatalogue.utils

import com.example.moviecatalogue.data.Movie
import com.example.moviecatalogue.data.TvShows
import com.example.moviecatalogue.data.source.remote.response.MovieResponse
import com.example.moviecatalogue.data.source.remote.response.TvShowsResponse

object DataDummy {
    fun generateRemoteDummyMovie() : List<MovieResponse>{
        val movie = ArrayList<MovieResponse>()
        movie.add(
            MovieResponse(
                "Aquaman",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xLPffWMhMj1l50ND3KchMjYoKmE.jpg",
                "Juli 6, 2018",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "Jason Momoa, Amber Heard, Willem Dafoe, Patrick Wilson, Nicole Kidman, Dolph Lundgren",
                "Aksi, Petualangan, Fantasi",
                "https://www.themoviedb.org/movie/297802-aquaman"
            )
        )
        movie.add(
            MovieResponse(
                "Infinity War",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                "April 25, 2018",
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                "Robert Downey Jr., Chris Hemsworth, Mark Ruffalo, Chris Evans, Scarlett Johansson, Tom Holland",
                "Petualangan, Aksi, Cerita Fiksi",
                "https://www.themoviedb.org/movie/299536-avengers-infinity-war"
            )
        )
        movie.add(
            MovieResponse(
                "Alita",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg",
                "Januari 31, 2019",
                "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Rosa Salazar, Christoph Waltz, Jennifer Connelly, Mahershala Ali, Ed Skrein",
                "Aksi, Cerita Fiksi, Petualangan",
                "https://www.themoviedb.org/movie/399579-alita-battle-angel"
            )
        )
        movie.add(
            MovieResponse(
                "Master Z",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7S0rXJPS15mZMWQieiRUf7WuReX.jpg",
                "Desember 20, 2018",
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                "Zhang Jin, Dave Bautista, Liu Yan, Xing Yu, Michelle Yeoh, Tony Jaa",
                "Aksi",
                "https://www.themoviedb.org/movie/450001-cheung-tin-chi"
            )
        )
        movie.add(
            MovieResponse(
                "Mortal Engines",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg",
                "November 27, 2018",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "Hester Shaw, Tom Natsworthy, Thaddeus Valentine, Anna Fang, Bevis Pod, Katherine Valentine",
                "Petualangan, Cerita Fiksi",
                "https://www.themoviedb.org/movie/428078-mortal-engines"
            )
        )
        movie.add(
            MovieResponse(
                "Overlord",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2Sfo3O54kTAAnBfZaCXrwimORSo.jpg",
                "November 1, 2018",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "Jovan Adepo, Wyatt Russell, Pilou Asbæk, Mathilde Ollivier, John Magaro, Iain De Caestecker",
                "Kengerian, Kejahatan, Cerita Fiksi",
                "https://www.themoviedb.org/movie/438799-overlord"
            )
        )
        movie.add(
            MovieResponse(
                "Ralph",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/44cb3fCGKUaSxxIjI2ejrgeYfye.jpg",
                "November 20, 2018",
                "Petualangan Baru Ralph dan Vanellope akan berlanjut dalam Ralph Breaks the Internet. 6 tahun pasca Wreck-It Ralph, Ralph dan Vanellope kini semakin jauh menjelajah ke dunia maya.",
                "John C. Reilly, Sarah Silverman, Gal Gadot, Taraji P. Henson, Jack McBrayer, Jane Lynch",
                "Keluarga, Animasi, Komedi, Petualangan",
                "https://www.themoviedb.org/movie/404368-ralph-breaks-the-internet"
            )
        )
        movie.add(
            MovieResponse(
                "Robin Hood",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9NS5QGOfck24yL3bZqWeW06PgPC.jpg",
                "Mei 12, 2010",
                "When soldier Robin happens upon the dying Robert of Loxley, he promises to return the man's sword to his family in Nottingham. There, he assumes Robert's identity; romances his widow, Marion; and draws the ire of the town's sheriff and King John's henchman, Godfrey",
                "Russell Crowe, Cate Blanchett, Max von Sydow, William Hurt, Mark Strong, Oscar Isaac",
                "Petualangan",
                "https://www.themoviedb.org/movie/20662-robin-hood"
            )
        )
        movie.add(
            MovieResponse(
                "Serenity",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg",
                "Januari 24, 2019",
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                "Matthew McConaughey, Anne Hathaway, Jason Clarke, Diane Lane, Djimon Hounsou",
                "Cerita Seru, Misteri, Drama",
                "https://www.themoviedb.org/movie/452832-serenity"
            )
        )
        movie.add(
            MovieResponse(
                "Spiderman",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "Desember 15, 2021",
                "Peter Parker menghadapi masalah besar. Hal ini terjadi setelah identitasnya sebagai Spiderman terungkap. Dengan kepergian Tony Stark, Peter Parker pun harus meminta bantuan Doctor Strange agar semua orang bisa melupakan identitasnya sebagai manusia laba-laba.",
                "Tom Holland, Zendaya, Benedict Cumberbatch, Jacob Batalon, Jon Favreau, Jamie Foxx",
                "Aksi, Petualangan, Cerita Fiksi",
                "https://www.themoviedb.org/movie/634649-spider-man-no-way-home"
            )
        )

        return movie
    }



    fun generateDummyMovie(): List<Movie> {
        val movie = ArrayList<Movie>()

        movie.add(
            Movie(
                "Aquaman",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xLPffWMhMj1l50ND3KchMjYoKmE.jpg",
                "Juli 6, 2018",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "Jason Momoa, Amber Heard, Willem Dafoe, Patrick Wilson, Nicole Kidman, Dolph Lundgren",
                "Aksi, Petualangan, Fantasi",
                "https://www.themoviedb.org/movie/297802-aquaman"
            )
        )
        movie.add(
            Movie(
                "Infinity War",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                "April 25, 2018",
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                "Robert Downey Jr., Chris Hemsworth, Mark Ruffalo, Chris Evans, Scarlett Johansson, Tom Holland",
                "Petualangan, Aksi, Cerita Fiksi",
                "https://www.themoviedb.org/movie/299536-avengers-infinity-war"
            )
        )
        movie.add(
            Movie(
                "Alita",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg",
                "Januari 31, 2019",
                "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Rosa Salazar, Christoph Waltz, Jennifer Connelly, Mahershala Ali, Ed Skrein",
                "Aksi, Cerita Fiksi, Petualangan",
                "https://www.themoviedb.org/movie/399579-alita-battle-angel"
            )
        )
        movie.add(
            Movie(
                "Master Z",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7S0rXJPS15mZMWQieiRUf7WuReX.jpg",
                "Desember 20, 2018",
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                "Zhang Jin, Dave Bautista, Liu Yan, Xing Yu, Michelle Yeoh, Tony Jaa",
                "Aksi",
                "https://www.themoviedb.org/movie/450001-cheung-tin-chi"
            )
        )
        movie.add(
            Movie(
                "Mortal Engines",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg",
                "November 27, 2018",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "Hester Shaw, Tom Natsworthy, Thaddeus Valentine, Anna Fang, Bevis Pod, Katherine Valentine",
                "Petualangan, Cerita Fiksi",
                "https://www.themoviedb.org/movie/428078-mortal-engines"
            )
        )
        movie.add(
            Movie(
                "Overlord",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2Sfo3O54kTAAnBfZaCXrwimORSo.jpg",
                "November 1, 2018",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "Jovan Adepo, Wyatt Russell, Pilou Asbæk, Mathilde Ollivier, John Magaro, Iain De Caestecker",
                "Kengerian, Kejahatan, Cerita Fiksi",
                "https://www.themoviedb.org/movie/438799-overlord"
            )
        )
        movie.add(
            Movie(
                "Ralph",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/44cb3fCGKUaSxxIjI2ejrgeYfye.jpg",
                "November 20, 2018",
                "Petualangan Baru Ralph dan Vanellope akan berlanjut dalam Ralph Breaks the Internet. 6 tahun pasca Wreck-It Ralph, Ralph dan Vanellope kini semakin jauh menjelajah ke dunia maya.",
                "John C. Reilly, Sarah Silverman, Gal Gadot, Taraji P. Henson, Jack McBrayer, Jane Lynch",
                "Keluarga, Animasi, Komedi, Petualangan",
                "https://www.themoviedb.org/movie/404368-ralph-breaks-the-internet"
            )
        )
        movie.add(
            Movie(
                "Robin Hood",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9NS5QGOfck24yL3bZqWeW06PgPC.jpg",
                "Mei 12, 2010",
                "When soldier Robin happens upon the dying Robert of Loxley, he promises to return the man's sword to his family in Nottingham. There, he assumes Robert's identity; romances his widow, Marion; and draws the ire of the town's sheriff and King John's henchman, Godfrey",
                "Russell Crowe, Cate Blanchett, Max von Sydow, William Hurt, Mark Strong, Oscar Isaac",
                "Petualangan",
                "https://www.themoviedb.org/movie/20662-robin-hood"
            )
        )
        movie.add(
            Movie(
                "Serenity",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg",
                "Januari 24, 2019",
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                "Matthew McConaughey, Anne Hathaway, Jason Clarke, Diane Lane, Djimon Hounsou",
                "Cerita Seru, Misteri, Drama",
                "https://www.themoviedb.org/movie/452832-serenity"
            )
        )
        movie.add(
            Movie(
                "Spiderman",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "Desember 15, 2021",
                "Peter Parker menghadapi masalah besar. Hal ini terjadi setelah identitasnya sebagai Spiderman terungkap. Dengan kepergian Tony Stark, Peter Parker pun harus meminta bantuan Doctor Strange agar semua orang bisa melupakan identitasnya sebagai manusia laba-laba.",
                "Tom Holland, Zendaya, Benedict Cumberbatch, Jacob Batalon, Jon Favreau, Jamie Foxx",
                "Aksi, Petualangan, Cerita Fiksi",
                "https://www.themoviedb.org/movie/634649-spider-man-no-way-home"
            )
        )

        return movie
    }

    fun generateRemoteDummyTv(): List<TvShowsResponse> {
        val tvShows = ArrayList<TvShowsResponse>()

        tvShows.add(
            TvShowsResponse(
                "Arrow",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg",
                "Oktober 10, 2012",
                "Panah adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow",
                "Stephen Amell, David Ramsey, Emily Bett Rickards, Paul Blackthorne, Willa Holland",
                "Kejahatan, Drama, Misteri, Aksi & Petualangan",
                "https://www.themoviedb.org/tv/1412-arrow"
            )
        )
        tvShows.add(
            TvShowsResponse(
                "Doom Patrol",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/kOAn06LmRCg4YiSStwrGL6UOQ3a.jpg",
                "Februari 15, 2019",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "Diane Guerrero, April Bowlby, Joivan Wade, Riley Shanahan, Matthew Zuk",
                "Sci-fi & Fantasy, Drama",
                "https://www.themoviedb.org/tv/79501-doom-patrol"
            )
        )
        tvShows.add(
            TvShowsResponse(
                "Dragon Ball",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xs1BRXnY5kStzwdxyrl2HYJOJCq.jpg",
                "November 30, 2012",
                "The series begins twelve years after Goku is seen leaving on Shenron not at the end of Dragon Ball GT, and diverges entirely into its own plot from there, on an alternate timeline from the one which shows Goku Jr. fighting Vegeta Jr. at the World Martial Arts Tournament. In this series, Majuub has reached new levels of power, and has honed the techniques taught to him by Goku. We also see Gotenks finally mature, and Vegeta more powerful than ever.",
                "(We don't have any cast added to this TV Show.)",
                "Animasi",
                "https://www.themoviedb.org/tv/118011-dragon-ball-absalon"
            )
        )
        tvShows.add(
            TvShowsResponse(
                "Fairy Tail",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/r6SjKZSsVbdwVZhdutu4qvRe63c.jpg",
                "Oktober 12, 2009",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "Yoshimitsu Shimoyama, Eiji Miyashita, Fuyuka Ono, Daisuke Namikawa, Masafumi Kimura",
                "Aksi & Petualangan, Animasi, Komedi, Sci-fi & Fantasy, Misteri",
                "https://www.themoviedb.org/tv/46261-fairy-tail"
            )
        )
        tvShows.add(
            TvShowsResponse(
                "Flash",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
                "Oktober 7, 2014",
                "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan.",
                "Grant Gustin, Candice Patton, Danielle Panabaker, Jesse L. Martin, Carlos Valdes",
                "Drama, Sci-fi & Fantasy",
                "https://www.themoviedb.org/tv/60735-the-flash"
            )
        )
        tvShows.add(
            TvShowsResponse(
                "Gotham",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iR3L0p59rOz1JZETXp0QvK5H4AZ.jpg",
                "September 22, 2014",
                "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia?",
                "Ben McKenzie, Donal Logue, David Mazouz, Sean Pertwee, Robin Lord Taylor",
                "Drama, Kejahatan, Sci-fi & Fantasy",
                "https://www.themoviedb.org/tv/60708-gotham"
            )
        )
        tvShows.add(
            TvShowsResponse(
                "Naruto Shippuden",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qOxedwaJzdms2alAmIEHEnDeDzg.jpg",
                "Februari 15, 2007",
                "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
                "Jouji Nakata, Junko Takeuchi, Chie Nakamura, Noriaki Sugiyama, Kazuhiko Inoue",
                "Animasi, Aksi & Petualangan, Sci-fi & Fantasy",
                "https://www.themoviedb.org/tv/31910-naruto-shipp-den"
            )
        )
        tvShows.add(
            TvShowsResponse(
                "Super Natural",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fpTVtf4isFQMv8VPwp0FS9yB8tc.jpg",
                "Oktober 5, 2014",
                "Small town Americana has been haunted for hundreds of years by monsters that weather created and folklore fostered.",
                "Thom Pinto",
                "Dokumenter",
                "https://www.themoviedb.org/tv/73756-american-super-natural"
            )
        )
        tvShows.add(
            TvShowsResponse(
                "The Simpson",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/k5UALlcA0EnviaCUn2wMjOWYiOO.jpg",
                "Desember 17, 1989",
                "Bertempat di Springfield, kota rata-rata di Amerika, pertunjukan ini berfokus pada kejenakaan dan petualangan sehari-hari keluarga Simpson; Homer, Marge, Bart, Lisa dan Maggie, serta ribuan pemain virtual. Sejak awal, serial ini telah menjadi ikon budaya pop, menarik ratusan selebriti menjadi bintang tamu. Acara ini juga menjadi terkenal karena satirnya yang tak kenal takut terhadap kehidupan politik, media, dan Amerika secara umum.",
                "Dan Castellaneta, Julie Kavner, Nancy Cartwright, Yeardley Smith, Hank Azaria",
                "Keluarga, Animasi, Komedi",
                "https://www.themoviedb.org/tv/456-the-simpsons"
            )
        )
        tvShows.add(
            TvShowsResponse(
                "The Walking Dead",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg",
                "Oktober 31, 2010",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu banyak penyintas lainnya di sepanjang jalan.",
                "Norman Reedus, Melissa McBride, Lauren Cohan, Danai Gurira, Andrew Lincoln, Chandler Riggs",
                "Aksi & Petualangan, Drama, Sci-fi & Fantasy",
                "https://www.themoviedb.org/tv/1402-the-walking-dead"
            )
        )

        return tvShows
    }

    fun generateDummyTv(): List<TvShows> {
        val tvShows = ArrayList<TvShows>()

        tvShows.add(
            TvShows(
                "Arrow",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg",
                "Oktober 10, 2012",
                "Panah adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow",
                "Stephen Amell, David Ramsey, Emily Bett Rickards, Paul Blackthorne, Willa Holland",
                "Kejahatan, Drama, Misteri, Aksi & Petualangan",
                "https://www.themoviedb.org/tv/1412-arrow"
            )
        )
        tvShows.add(
            TvShows(
                "Doom Patrol",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/kOAn06LmRCg4YiSStwrGL6UOQ3a.jpg",
                "Februari 15, 2019",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "Diane Guerrero, April Bowlby, Joivan Wade, Riley Shanahan, Matthew Zuk",
                "Sci-fi & Fantasy, Drama",
                "https://www.themoviedb.org/tv/79501-doom-patrol"
            )
        )
        tvShows.add(
            TvShows(
                "Dragon Ball",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xs1BRXnY5kStzwdxyrl2HYJOJCq.jpg",
                "November 30, 2012",
                "The series begins twelve years after Goku is seen leaving on Shenron not at the end of Dragon Ball GT, and diverges entirely into its own plot from there, on an alternate timeline from the one which shows Goku Jr. fighting Vegeta Jr. at the World Martial Arts Tournament. In this series, Majuub has reached new levels of power, and has honed the techniques taught to him by Goku. We also see Gotenks finally mature, and Vegeta more powerful than ever.",
                "(We don't have any cast added to this TV Show.)",
                "Animasi",
                "https://www.themoviedb.org/tv/118011-dragon-ball-absalon"
            )
        )
        tvShows.add(
            TvShows(
                "Fairy Tail",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/r6SjKZSsVbdwVZhdutu4qvRe63c.jpg",
                "Oktober 12, 2009",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "Yoshimitsu Shimoyama, Eiji Miyashita, Fuyuka Ono, Daisuke Namikawa, Masafumi Kimura",
                "Aksi & Petualangan, Animasi, Komedi, Sci-fi & Fantasy, Misteri",
                "https://www.themoviedb.org/tv/46261-fairy-tail"
            )
        )
        tvShows.add(
            TvShows(
                "Flash",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
                "Oktober 7, 2014",
                "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan.",
                "Grant Gustin, Candice Patton, Danielle Panabaker, Jesse L. Martin, Carlos Valdes",
                "Drama, Sci-fi & Fantasy",
                "https://www.themoviedb.org/tv/60735-the-flash"
            )
        )
        tvShows.add(
            TvShows(
                "Gotham",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iR3L0p59rOz1JZETXp0QvK5H4AZ.jpg",
                "September 22, 2014",
                "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia?",
                "Ben McKenzie, Donal Logue, David Mazouz, Sean Pertwee, Robin Lord Taylor",
                "Drama, Kejahatan, Sci-fi & Fantasy",
                "https://www.themoviedb.org/tv/60708-gotham"
            )
        )
        tvShows.add(
            TvShows(
                "Naruto Shippuden",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qOxedwaJzdms2alAmIEHEnDeDzg.jpg",
                "Februari 15, 2007",
                "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
                "Jouji Nakata, Junko Takeuchi, Chie Nakamura, Noriaki Sugiyama, Kazuhiko Inoue",
                "Animasi, Aksi & Petualangan, Sci-fi & Fantasy",
                "https://www.themoviedb.org/tv/31910-naruto-shipp-den"
            )
        )
        tvShows.add(
            TvShows(
                "Super Natural",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fpTVtf4isFQMv8VPwp0FS9yB8tc.jpg",
                "Oktober 5, 2014",
                "Small town Americana has been haunted for hundreds of years by monsters that weather created and folklore fostered.",
                "Thom Pinto",
                "Dokumenter",
                "https://www.themoviedb.org/tv/73756-american-super-natural"
            )
        )
        tvShows.add(
            TvShows(
                "The Simpson",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/k5UALlcA0EnviaCUn2wMjOWYiOO.jpg",
                "Desember 17, 1989",
                "Bertempat di Springfield, kota rata-rata di Amerika, pertunjukan ini berfokus pada kejenakaan dan petualangan sehari-hari keluarga Simpson; Homer, Marge, Bart, Lisa dan Maggie, serta ribuan pemain virtual. Sejak awal, serial ini telah menjadi ikon budaya pop, menarik ratusan selebriti menjadi bintang tamu. Acara ini juga menjadi terkenal karena satirnya yang tak kenal takut terhadap kehidupan politik, media, dan Amerika secara umum.",
                "Dan Castellaneta, Julie Kavner, Nancy Cartwright, Yeardley Smith, Hank Azaria",
                "Keluarga, Animasi, Komedi",
                "https://www.themoviedb.org/tv/456-the-simpsons"
            )
        )
        tvShows.add(
            TvShows(
                "The Walking Dead",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg",
                "Oktober 31, 2010",
                "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu banyak penyintas lainnya di sepanjang jalan.",
                "Norman Reedus, Melissa McBride, Lauren Cohan, Danai Gurira, Andrew Lincoln, Chandler Riggs",
                "Aksi & Petualangan, Drama, Sci-fi & Fantasy",
                "https://www.themoviedb.org/tv/1402-the-walking-dead"
            )
        )

        return tvShows
    }
}
