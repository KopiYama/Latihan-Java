import java.util.Scanner;
import java.text.DecimalFormat;

public class GajiPNSMRizkyA {
    public static int[][] gajiPokokGol1 = {
            {1560800, 1560800, 1560800, 1560800},
            {1560800, 1560800, 1560800, 1560800},
            {1610000, 1610000, 1610000, 1610000},
            {1610000, 1704500, 1776600, 1851800},
            {1660700, 1704500, 1776600, 1851800},
            {1660700, 1758200, 1832600, 1910100},
            {1713000, 1758200, 1832600, 1910100},
            {1713000, 1813600, 1890300, 1970200},
            {1766900, 1813600, 1890300, 1970200},
            {1766900, 1870700, 1949800, 2032300},
            {1822600, 1870700, 1949800, 2032300},
            {1822600, 1929600, 2011200, 2096300},
            {1880000, 1929600, 2011200, 2096300},
            {1880000, 1990400, 2074600, 2162300},
            {1939200, 1990400, 2074600, 2162300},
            {1939200, 2053100, 2139900, 2230400},
            {2000300, 2053100, 2139900, 2230400},
            {2000300, 2117700, 2207300, 2300700},
            {2063300, 2117700, 2207300, 2300700},
            {2063300, 2184400, 2276800, 2373100},
            {2128300, 2184400, 2276800, 2373100},
            {2128300, 2253200, 2348500, 2447900},
            {2195300, 2253200, 2348500, 2447900},
            {2195300, 2324200, 2422500, 2525000},
            {2264400, 2324200, 2422500, 2525000},
            {2264400, 2397400, 2498800, 2604500},
            {2335800, 2397400, 2498800, 2604500},
            {2335800, 2472900, 2557500, 2686500}
    };

    public static int[][] gajiPokokGol2 = {
            {2022200, 2022200, 2022200, 2022200},
            {2054100, 2054100, 2054100, 2054100},
            {2054100, 2054100, 2054100, 2054100},
            {2118800, 2208400, 2301800, 2399200},
            {2118800, 2208400, 2301800, 2399200},
            {2185500, 2277900, 2374300, 2474700},
            {2185500, 2277900, 2374300, 2474700},
            {2254300, 2349700, 2449100, 2552700},
            {2254300, 2349700, 2449100, 2552700},
            {2325300, 2423700, 2526200, 2633100},
            {2325300, 2423700, 2526200, 2633100},
            {2398600, 2500000, 2605800, 2716000},
            {2398600, 2500000, 2605800, 2716000},
            {2474100, 2578800, 2687800, 2801500},
            {2474100, 2578800, 2687800, 2801500},
            {2552000, 2660000, 2772500, 2889800},
            {2552000, 2660000, 2772500, 2889800},
            {2632400, 2743800, 2859800, 2980800},
            {2632400, 2743800, 2859800, 2980800},
            {2715300, 2830200, 2949900, 3074700},
            {2715300, 2830200, 2949900, 3074700},
            {2800800, 2919300, 3042800, 3171500},
            {2800800, 2919300, 3042800, 3171500},
            {2891100, 3011200, 3138600, 3271400},
            {2891100, 3011200, 3138600, 3271400},
            {2980000, 3106100, 3237500, 3374400},
            {2980000, 3106100, 3237500, 3374400},
            {3073900, 3203900, 3349400, 3480700},
            {3073900, 3203900, 3349400, 3480700},
            {3170700, 3304800, 3454600, 3590300},
            {3170700, 3304800, 3454600, 3590300},
            {3270600, 3408900, 3553100, 3703400},
            {3270600, 3408900, 3553100, 3703400},
            {3373600, 3516300, 3665000, 3820000}
    };

    public static int[][] gajiPokokGol3 = {
            {2579400, 2688500, 2802300, 2920800}, //0
            {2579400, 2688500, 2802300, 2920800}, //1
            {2660700, 2773200, 2890500, 3012800}, //2
            {2660700, 2773200, 2890500, 3012800}, //3
            {2744500, 2860500, 2981500, 3107700}, //4
            {2744500, 2860500, 2981500, 3107700}, //5
            {2830900, 2950600, 3075500, 3205500}, //6
            {2830900, 2950600, 3075500, 3205500}, //7
            {2920100, 3043600 ,3172300, 3306500}, //8
            {2920100, 3043600 ,3172300, 3306500}, //9
            {3012000, 3139400, 3272200, 3410600}, //10
            {3012000, 3139400, 3272200, 3410600}, //11
            {3106900, 3238300, 3375300, 3518100}, //12
            {3106900, 3238300, 3375300, 3518100}, //13
            {3204700, 3340300, 3481600, 3628900}, //14
            {3204700, 3340300, 3481600, 3628900}, //15
            {3305700, 3445500, 3591200, 3743100}, //16
            {3305700, 3445500, 3591200, 3743100}, //17
            {3409800, 3554000, 3704300, 3861000}, //18
            {3409800, 3554000, 3704300, 3861000}, //19
            {3517200, 3665900, 3821000, 3982600}, //20
            {3517200, 3665900, 3821000, 3982600}, //21
            {3627900, 3781400, 3941400, 4108100}, //22
            {3627900, 3781400, 3941400, 4108100}, //23
            {3742200, 3900500, 4065500, 4237500}, //24
            {3742200, 3900500, 4065500, 4237500}, //25
            {3860100, 4023300, 4193500, 4370900}, //26
            {3860100, 4023300, 4193500, 4370900}, //27
            {3981600, 4150100, 4325600, 4508600}, //28
            {3981600, 4150100, 4325600, 4508600}, //29
            {4107000, 4280800, 4461800, 4650600}, //30
            {4107000, 4280800, 4461800, 4650600}, //31
            {4236400, 4415600, 4602400, 4797000} //32
    };

    public static int[][] gajiPokokGol4 = {
            {3044300, 3173100, 3307300, 3447200, 3593100}, //0
            {3044300, 3173100, 3307300, 3447200, 3593100}, //1
            {3140200, 3272100, 3411500, 3555800, 3706200}, //2
            {3140200, 3272100, 3411500, 3555800, 3706200}, //3
            {3239100, 3376100, 3518900, 3667800, 3822900}, //4
            {3239100, 3376100, 3518900, 3667800, 3822900}, //5
            {3341100, 3482500, 3629800, 3783300, 3943300}, //6
            {3341100, 3482500, 3629800, 3783300, 3943300}, //7
            {3446400, 3592100, 3744100, 3902500, 4067500}, //8
            {3446400, 3592100, 3744100, 3902500, 4067500}, //9
            {3554900, 3705300, 3862000, 4025400, 4195700}, //10
            {3554900, 3705300, 3862000, 4025400, 4195700}, //11
            {3666900, 3822000, 3983600, 4152200, 4327800}, //12
            {3666900, 3822000, 3983600, 4152200, 4327800}, //13
            {3782400, 3942400, 4109100, 4282900, 4462100}, //14
            {3782400, 3942400, 4109100, 4282900, 4462100}, //15
            {3901500, 4066500, 4238500, 4417800, 4604700}, //16
            {3901500, 4066500, 4238500, 4417800, 4604700}, //17
            {4024400, 4194600, 4372000, 4557000, 4749700}, //18
            {4024400, 4194600, 4372000, 4557000, 4749700}, //19
            {4151100, 4326700, 4509700, 4700500, 4899300}, //20
            {4151100, 4326700, 4509700, 4700500, 4899300}, //21
            {4281800, 4463000, 4651800, 4848500, 5053600}, //22
            {4281800, 4463000, 4651800, 4848500, 5053600}, //23
            {4416700, 4603500, 4798300, 5001200, 5212800}, //24
            {4416700, 4603500, 4798300, 5001200, 5212800}, //25
            {4555800, 4748500, 4949400, 5158700, 5377000}, //26
            {4555800, 4748500, 4949400, 5158700, 5377000}, //27
            {4699300, 4898100, 5105300, 5321200, 5546300}, //28
            {4699300, 4898100, 5105300, 5321200, 5546300}, //29
            {4847300, 5052300, 5266100, 5488800, 5721000}, //30
            {4847300, 5052300, 5266100, 5488800, 5721000}, //31
            {5000000, 5211500, 5431900, 5661700, 5901200} //32
    };

    public static int kalkulasiGajiPokok(int golongan, int masaKerja, char ruangKerja) {
        int[][] gajiPokok = null;
        int ruangIndex = 0;

        switch (golongan) {
            case 1:
                gajiPokok = gajiPokokGol1;
                break;
            case 2:
                gajiPokok = gajiPokokGol2;
                break;
            case 3:
                gajiPokok = gajiPokokGol3;
                break;
            case 4:
                gajiPokok = gajiPokokGol4;
                break;
        }

        if (golongan >= 1 && golongan <= 3) {
            if (ruangKerja >= 'A' && ruangKerja <= 'D') {
                ruangIndex = ruangKerja - 'A';
            } else {
                // Handle error for invalid ruang kerja in Golongan 1-3
                System.out.println("Invalid ruang kerja for Golongan " + golongan + ": " + ruangKerja);
                return 0;
            }
        } else if (golongan == 4) {
            if (ruangKerja >= 'A' && ruangKerja <= 'E') {
                ruangIndex = ruangKerja - 'A';
            } else {
                // Handle error for invalid ruang kerja in Golongan 4
                System.out.println("Invalid ruang kerja for Golongan " + golongan + ": " + ruangKerja);
                return 0;
            }
        } else {
            // Handle error for invalid golongan
            System.out.println("Invalid golongan: " + golongan);
            return 0;
        }

        int masaKerjaIndex = Math.min(masaKerja, gajiPokok.length - 1);
        return gajiPokok[masaKerjaIndex][ruangIndex];
    }

    public static int kalkulasiTunjanganKeluarga(int gajiPokok, String statusPernikahan) {
        if (statusPernikahan.equalsIgnoreCase("Kawin")) {
            return (int) (gajiPokok * 0.1);
        } else {
            return 0;
        }
//        // Ubah dari "1" menjadi "Kawin"
//        if (statusPernikahan.equals("Kamin")) {
//            statusPernikahan = "Kawin";
//        }
//
//        // Hitung tunjangan keluarga jika status pernikahan adalah "Kawin"
//        if (statusPernikahan.equalsIgnoreCase("Kawin")) {
//            return (int) (gajiPokok * 0.1);
//        } else {
//            return 0;
//        }
    }

    public static int kalkulasiTunjanganAnak(int gajiPokok, int jumlahAnak) {
        //return (int) (gajiPokok * 0.02 * Math.min(jumlahAnak, 2));
        return (jumlahAnak > 0) ? (int) (gajiPokok * 0.02 * Math.min(jumlahAnak, 2)) : 0;
    }

    public static int kalkulasiTunjanganBeras(int jumlahAnggotaKeluarga) {
        final int HARGA_BERAS_PER_KG = 15000;
        final int BERAS_PER_ANGGOTA = 10;
        final int MAX_ANGGOTA = 4;

        int anggotaUntukBeras = Math.min(jumlahAnggotaKeluarga, MAX_ANGGOTA);

        return anggotaUntukBeras * BERAS_PER_ANGGOTA * HARGA_BERAS_PER_KG;
    }

    public static int kalkulasiTunjanganUmumJabatan(int golongan) {
        switch (golongan) {
            case 1:
                return 175000;
            case 2:
                return 180000;
            case 3:
                return 185000;
            case 4:
                return 190000;
            default:
                System.out.println("Golongan tidak valid: " + golongan);
                return 0;
        }
    }

    public static int kalkulasiGajiKotor(int gajiPokok, int tunjanganKeluarga, int tunjanganAnak,
                                         int tunjanganBeras, int tunjanganUmumJabatan) {
        return gajiPokok + tunjanganKeluarga + tunjanganAnak + tunjanganBeras + tunjanganUmumJabatan;
    }

    public static double kalkulasiPotonganPPH(int gajiPokok, String statusPernikahan,
                                              int gajiKotor, int jumlahAnak, int tunjanganKeluarga, int tunjanganAnak) {
        final double PTKP_SENDIRI = 36000000;
        final double PTKP_PASANGAN = 3000000;
        final double PTKP_ANAK = 3000000;
        final double MAX_PTKP_ANAK = 3;
        final double BIAYA_JABATAN_PCT = 0.05;
        final double IURAN_PENSIUN_PCT = 0.0475;
        final double PENGHASILAN_MINIMUM = 4500000;
        final double PPH_TARIF = 0.05;

        if (gajiKotor <= PENGHASILAN_MINIMUM) {
            return 0;
        }

        double ptkp = PTKP_SENDIRI;
        if (statusPernikahan.equals("Kawin")) { // Kawin
            ptkp += PTKP_PASANGAN;
        }
        ptkp += Math.min(jumlahAnak, MAX_PTKP_ANAK) * PTKP_ANAK;

        double biayaJabatan = Math.min(BIAYA_JABATAN_PCT * gajiKotor, 6000000);
        double iuranPensiun = IURAN_PENSIUN_PCT * (gajiPokok + tunjanganKeluarga + tunjanganAnak);

        double penghasilanNetoSetahun = (gajiKotor - biayaJabatan - iuranPensiun) * 12;
        double pkp = penghasilanNetoSetahun - ptkp;
        if (pkp < 0) {
            pkp = 0;
        }

        double pphSetahun = PPH_TARIF * pkp;
        return pphSetahun / 12;
//        final double PTKP_SENDIRI = 36000000; // Penghasilan Tidak Kena Pajak untuk diri sendiri
//        final double PTKP_PASANGAN = 3000000; // PTKP untuk pasangan
//        final double PTKP_ANAK = 3000000; // PTKP untuk tiap anak
//        final double MAX_PTKP_ANAK = 3; // Maksimal jumlah anak untuk PTKP
//        final double BIAYA_JABATAN_PCT = 0.05; // Persentase biaya jabatan
//        final double IURAN_PENSIUN_PCT = 0.0475; // Persentase iuran pensiun
//        final double PPH_TARIF = 0.05; // Tarif PPh 5%
//
//        // Penghitungan PTKP
//        double ptkp = PTKP_SENDIRI;
//        if (statusPernikahan.equalsIgnoreCase("Kawin")) {
//            ptkp += PTKP_PASANGAN;
//        }
//        ptkp += Math.min(jumlahAnak, MAX_PTKP_ANAK) * PTKP_ANAK;
//
//        // Penghitungan Biaya Jabatan dan Iuran Pensiun tahunan
//        double biayaJabatan = Math.min(BIAYA_JABATAN_PCT * gajiKotor, 6000000);
//        double iuranPensiun = IURAN_PENSIUN_PCT * (gajiPokok + tunjanganKeluarga + tunjanganAnak);
//
//        // Penghasilan kena pajak (PKP)
//        double pkp = (gajiKotor - biayaJabatan - iuranPensiun * 12) - ptkp;
//        if (pkp < 0) {
//            pkp = 0; // Tidak ada PPh jika PKP negatif
//        }
//
//        // Perhitungan PPh setahun
//        double pphSetahun = PPH_TARIF * pkp;
//
//        // Perhitungan PPh sebulan
//        double pphSebulan = pphSetahun / 12;
//
//        return pphSebulan;
    }

    public static double kalkulasiPotonganIWP(int gajiPokok, int tunjanganKeluarga, int tunjanganAnak) {
        final double IWP_RATE = 0.1; // IWP rate 10%
        return (gajiPokok + tunjanganKeluarga + tunjanganAnak) * IWP_RATE;
    }

    public static int kalkulasiPotonganTaperum(int golongan) {
        switch (golongan) {
            case 1:
                return 3000;
            case 2:
                return 5000;
            case 3:
                return 7000;
            case 4:
                return 10000;
            default:
                System.out.println("Golongan tidak valid: " + golongan);
                return 0;
        }
    }

    public static double kalkulasiGajiBersih(int gajiKotor, double potonganPPH, double potonganIWP, int potonganTaperum) {
        return gajiKotor - (potonganPPH + potonganIWP + potonganTaperum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,##0.00");

        System.out.print("Masukkan Nama Pegawai: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Golongan Pangkat (1-4): ");
        int golongan = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan Ruang Kerja (A-E): ");
        char ruangKerja = scanner.nextLine().charAt(0);

        System.out.print("Masukkan Masa Kerja: ");
        int masaKerja = Integer.parseInt(scanner.nextLine());

        System.out.print("Status Pernikahan (Kawin/Belum Kawin/Cerai): ");
        String statusPernikahan = scanner.nextLine();

        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = Integer.parseInt(scanner.nextLine());

        int jumlahAnggotaKeluarga = 1; // Pegawai PNS nya
        if (statusPernikahan.equals("Kawin")) { // Jika berstatus kawin
            jumlahAnggotaKeluarga += 1; // Tambah jumlah keluarga dengan istri nya
        }
        // Tambah jumlah anak jika ada
        jumlahAnggotaKeluarga += jumlahAnak;

        // Hitung komponen gaji
        int gajiPokok = kalkulasiGajiPokok(golongan, masaKerja, ruangKerja);
        int tunjanganKeluarga = kalkulasiTunjanganKeluarga(gajiPokok, statusPernikahan);
        int tunjanganAnak = kalkulasiTunjanganAnak(gajiPokok, jumlahAnak);
        int tunjanganBeras = kalkulasiTunjanganBeras(jumlahAnggotaKeluarga);
        //int tunjanganBeras = kalkulasiTunjanganBeras(jumlahAnak + (statusPernikahan.equalsIgnoreCase("Kawin") ? 2 : 1));
        int tunjanganUmum = kalkulasiTunjanganUmumJabatan(golongan);
        int gajiKotor = kalkulasiGajiKotor(gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras, tunjanganUmum);
        double potonganPPH = kalkulasiPotonganPPH(gajiPokok, statusPernikahan, gajiKotor, jumlahAnak, tunjanganKeluarga, tunjanganAnak);
        double potonganIWP = kalkulasiPotonganIWP(gajiPokok, tunjanganKeluarga, tunjanganAnak);
        int potonganTaperum = kalkulasiPotonganTaperum(golongan);
        double gajiBersih = kalkulasiGajiBersih(gajiKotor, potonganPPH, potonganIWP, potonganTaperum);

        // Tampilkan output
        displayOutput(nama, gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras, tunjanganUmum, gajiKotor, potonganPPH, potonganIWP, potonganTaperum, gajiBersih, formatter);
    }

    public static void displayOutput(String nama, int gajiPokok, int tunjanganKeluarga, int tunjanganAnak, int tunjanganBeras, int tunjanganUmum, int gajiKotor, double potonganPPH, double potonganIWP, int potonganTaperum, double gajiBersih, DecimalFormat formatter) {
        System.out.println("\nSlip Gaji PNS");
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pokok: " + formatter.format(gajiPokok));
        System.out.println("Tunjangan Keluarga: " + formatter.format(tunjanganKeluarga));
        System.out.println("Tunjangan Anak: " + formatter.format(tunjanganAnak));
        System.out.println("Tunjangan Beras: " + formatter.format(tunjanganBeras));
        System.out.println("Tunjangan Umum Jabatan: " + formatter.format(tunjanganUmum));
        System.out.println("Gaji Bruto: " + formatter.format(gajiKotor));
        System.out.println("PPH: " + formatter.format(potonganPPH));
        System.out.println("Potongan IWP: " + formatter.format(potonganIWP));
        System.out.println("Potongan Taperum: " + formatter.format(potonganTaperum));
        System.out.println("Gaji Bersih (Take Home Pay): " + formatter.format(gajiBersih));
    }

}
