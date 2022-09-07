/*
 * Copyright (c) 2017. http://hiteshsahu.com- All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * If you use or distribute this project then you MUST ADD A COPY OF LICENCE
 * along with the project.
 *  Written by Hitesh Sahu <hiteshkrsahu@Gmail.com>, 2017.
 */

package com.prakash_shaw.shoppingapp.domain.mock;

import com.prakash_shaw.shoppingapp.model.CenterRepository;
import com.prakash_shaw.shoppingapp.model.entities.Product;
import com.prakash_shaw.shoppingapp.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
 */
public class FakeWebServer {

    private static FakeWebServer fakeServer;

    public static FakeWebServer getFakeWebServer() {

        if (null == fakeServer) {
            fakeServer = new FakeWebServer();
        }
        return fakeServer;
    }

    void initiateFakeServer() {

        addCategory();

    }

    public void addCategory() {

        ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

        listOfCategory
                .add(new ProductCategoryModel(
                        "Electronic",
                        "Electric Items",
                        "10%",
                        "https://storage.googleapis.com/gweb-uniblog-publish-prod/original_images/Old_Electronics_hero_1.jpg"));

        listOfCategory
                .add(new ProductCategoryModel(
                        "Furnitures",
                        "Furnitures Items",
                        "15%",
                        "https://previews.123rf.com/images/angeldots/angeldots1705/angeldots170500004/77784164-innenwohnzimmer-vector-illustration-im-flachen-design-mit-schatten-hausm%C3%B6bel-karikaturhintergrund-in.jpg"));

        CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
    }

    public void getAllElectronics() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> laptoplist = new ArrayList<Product>();

        // Ovens
        laptoplist
                .add(new Product(
                        "Lenovo IdeaPad 3",
                        "10th Gen Intel Core i5 15.6 FHD Thin and Light Laptop (8GB/512GB SDD/Windows 11/MS Office 2021/2Yr Warranty/Platinum Grey/1.85Kg), 81WE01MAIN",
                        " Processor: 10th Gen Intel Core i5-1035G1 | Speed: 1.0 GHz (Base) - 3.6 GHz (Max) | 4 Cores | 8 Threads | 6MB Cache\n\n" +
                                " OS: Pre-Loaded Windows 11 Home with Lifetime Validity\n\n" +
                                " Pre-Installed: MS Office Home and Student 2021\n\n" +
                                " Memory and Storage: 8GB RAM DDR4-2666, Upgradable to 12GB | 512 GB SSD\n\n" +
                                " Graphics: Intel UHD Integrated Graphics\n\n" +
                                " Display: 15.6\" FHD (1920x1080) | Brightness: 250 nits | Anti-Glare\n\n" +
                                " Design: 1.99 cm Thin and 1.85 kg Light\n",
                        "72669",
                        "33",
                        "48490",
                        "0",
                        "https://m.media-amazon.com/images/I/61Dw5Z8LzJL._SY450_.jpg",
                        "laptop_1"));

        laptoplist
                .add(new Product(
                        "ASUS VivoBook 15",
                        "15.6-inch (39.62 cm) HD, Dual Core Intel Celeron N4020, Thin and Light Laptop (4GB RAM/256GB SSD/Integrated Graphics/Windows 11 Home/Transparent Silver/1.8 Kg), X515MA-BR011W",
                        " Processor: Intel Celeron N4020, 1.1 GHz base speed, Up to 2.8 GHz Turbo Speed, 2 cores, 2 Threads, 4MB Cache\n\n" +
                                " Memory & Storage: 4GB SO-DIMM DDR4 2400MHz RAM, Support up to 8GB using 1x SO-DIMM Slot with | Storage: 256GB M.2 NVMe PCIe SSD\n\n" +
                                " Display: 15.6-inch (39.62 cms), LED-Backlit LCD, HD (1366 x 768) 16:9, 220nits, NanoEdge bezel, Anti-Glare Plane with 45% NTSC, 82% Screen-To-Body Ratio\n" +
                                " Operating System: Pre-loaded Windows 11 Home with lifetime validity\n\n" +
                                " Design & battery: Up to 19.9mm Thin | NanoEdge Bezels | Thin and Light Laptop | Laptop weight: 1.8 kg | 37WHrs, 2-cell Li-ion battery | Up to 6 hours battery life ;Note: Battery life depends on conditions of usage\n\n" +
                                " Keyboard: Chiclet Keyboard with 1.4mm Key Travel\n\n" +
                                " I/O Ports: 1x HDMI 1.4 | 1x 3.5mm Combo Audio Jack | 1x USB 3.2 Gen 1 Type-A | 1x USB 3.2 Gen 1 Type-C | 2x USB 2.0 Type-A\n\n" +
                                " Other: Wi-Fi 5 (802.11ac) (Dual band) 1*1 | VGA webcamera without privacy shutter | Built-in speaker | Built-in microphone\n",
                        "33990",
                        "15",
                        "28990",
                        "0",
                        "https://m.media-amazon.com/images/I/71S8U9VzLTL._SX425_.jpg",
                        "laptop_2"));

        laptoplist
                .add(new Product(
                        "Lenovo IdeaPad 3",
                        "10th Gen Intel Core i5 15.6 FHD Thin and Light Laptop (8GB/512GB SDD/Windows 11/MS Office 2021/2Yr Warranty/Platinum Grey/1.85Kg), 81WE01MAIN",
                        " RAM : 4 GB of DDR4 onboard memory, upgradable up to 8GB of DDR4 system memory using single soDIMM module\n\n" +
                                " Display : 15.6\" HD 1366 x 768 resolution, high-brightness Acer ComfyView LED-backlit TFT LCD | Graphics : AMD Radeon Graphics\n\n" +
                                " Storage : SSD : 256 GB, PCIe Gen3, 8 Gb/s, NVMe | HDD : Supports up to 2 TB 2.5-inch 5400 RPM\n\n" +
                                " OS : Windows 11 Home | Battery : Up to 9 hours | Weight : 1.9 Kg | Color : Silver\n",
                        "36999",
                        "22",
                        "28990",
                        "0",
                        "https://m.media-amazon.com/images/I/61+aWMiN06L._SY450_.jpg",
                        "laptop_3"));

        laptoplist
                .add(new Product(
                        "ASUS VivoBook 14",
                        "14-inch (35.56 cm) HD, Intel Pentium Silver N6000 Quad Core, Thin and Light Laptop (8GB/256GB SSD/Office 2021/Windows 11/Integrated Graphics/Silver/1.5 kg), X415KA-BV121WS",
                        " Intel Pentium Silver N6000 Processor 1.1 GHz (4M Cache, up to 3.3 GHz, 4 cores)\n\n" +
                                "Whether for work or play, ASUS VivoBook 14 X415 is the entry-level laptop that delivers powerful performance and immersive visuals.\n\n" +
                                "Its NanoEdge display and a matte anti-glare coating for a truly engaging experience.\n\n" +
                                "A dual-storage design with a SSD and a HDD gives you the perfect combination of large storage capacity and fast data read / write speeds.\n",
                        "38990",
                        "18",
                        "31990",
                        "0",
                        "https://m.media-amazon.com/images/I/71WuDXpTAlL._SX425_.jpg",
                        "laptop_4"));

        laptoplist
                .add(new Product(
                        "Lenovo Chromebook 14e",
                        "14.0\" FHD Business Laptop (AMD 3015Ce Processor/4GB DDR4 RAM/64GB Storage eMMC/AMD Radeon Graphics/Chrome OS/Grey) 82M10019HA",
                        " Light, portable, rugged, productive, MIL-STD-810G military test passed & enable with Google Security Chip H1 The Lenovo 14e Chromebook is powered for teaching and durable for the classroom. The drop-resistant design and water-resistant keyboard can face whatever students dish out\n\n" +
                                "Processor: AMD A3015Ce processor, 1.2 Ghz base speed, 2.3 Ghz max speed, 2 Cores, 1 Mb Smart Cache | Memory: 4GB DDR4 1600 MHz, Not Upgradable | Storage: 64 GB eMMc 5.1 on systemboard.\n",
                        "60000",
                        "55",
                        "26990",
                        "0",
                        "https://m.media-amazon.com/images/I/61DII2qI68L._SX450_.jpg",
                        "laptop_5"));

        laptoplist
                .add(new Product(
                        "Dell New Inspiron 3511",
                        "Intel i3-1115G4 15.6 inches Anti Glare FHD Display Laptop , 8GB DDR4, 1TB, Windows 11 + MSO'21, Integrated Graphics, Carbon Black (D560646WIN9B), 1.8Kgs",
                        " Light, portable, rugged, productive, MIL-STD-810G military test passed & enable with Google Security Chip H1 The Lenovo 14e Chromebook is powered for teaching and durable for the classroom. The drop-resistant design and water-resistant keyboard can face whatever students dish out\n\n" +
                                "Processor: AMD A3015Ce processor, 1.2 Ghz base speed, 2.3 Ghz max speed, 2 Cores, 1 Mb Smart Cache | Memory: 4GB DDR4 1600 MHz, Not Upgradable | Storage: 64 GB eMMc 5.1 on systemboard.\n",
                        "48239",
                        "19",
                        "38990",
                        "0",
                        "https://m.media-amazon.com/images/I/61XR0oGhF6L._SX425_.jpg",
                        "laptop_6"));

        productMap.put("Laptop", laptoplist);

        ArrayList<Product> smartphonelist = new ArrayList<Product>();

        // Ovens
        smartphonelist
                .add(new Product(
                        "Redmi 9",
                        "Sky Blue, 4GB RAM, 64GB Storage) | 2.3GHz Mediatek Helio G35 Octa core Processor",
                        "3+2MP Rear camera with AI Portrait, AI scene recognition, HDR, Pro mode | 5MP front facing camera\n\n" +
                                "16.58 centimeters (6.53-inch) HD+ multi-touch capacitive touchscreen with 1600 x 720 pixels resolution, 268 ppi pixel density, 20:9 aspect ratio\n\n" +
                                "Memory, Storage & SIM: 4GB RAM | 64GB storage expandable up to 512GB| Dual SIM with dual standby (4G+4G)\n\n" +
                                "Android v10 operating system with 2.3GHz Mediatek Helio G35 octa core processor\n",
                        "10999",
                        "14",
                        "9499",
                        "0",
                        "https://m.media-amazon.com/images/I/71A9Vo1BatL._SX679_.jpg",
                        "smartphone_1"));

        smartphonelist
                .add(new Product(
                        "OPPO A31",
                        "Fantasy White, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers",
                        "12+2+2MP triple rear camera (12MP main camera+2MP macro lens+2MP depth camera) with Portrait bokeh, macro lens, dazzle color mode, AI beautification | 8MP front camera\n\n" +
                                "16.5 centimeters (6.5-inch) waterdrop multi touch screen with an 89% screen to body ratio | 1600 x 720 pixels resolution, 269 ppi pixel density\n\n" +
                                "Memory, Storage & SIM: 6GB RAM | 128GB internal memory expandable up to 256GB | Dual SIM (nano+nano) dual-standby (4G+4G)\n\n" +
                                "Android Pie v9.0 based on ColorOS 6.1 operating system with 2.3GHz Mediatek 6765 octa core processor, IMG GE8320\n",
                        "15990",
                        "19",
                        "12989",
                        "0",
                        "https://m.media-amazon.com/images/I/61CnyJ-IbML._SX679_.jpg",
                        "smartphone_2"));

        smartphonelist
                .add(new Product(
                        "Samsung Galaxy M12",
                        "Blue,4GB RAM, 64GB Storage) 6000 mAh with 8nm Processor | True 48 MP Quad Camera | 90Hz Refresh Rate",
                        "48MP+5MP+2MP+2MP Quad camera setup- True 48MP (F 2.0) main camera + 5MP (F2.2) Ultra wide camera+ 2MP (F2.4) depth camera + 2MP (2.4) Macro Camera| 8MP (F2.2) front came\n\n" +
                                "6000mAH lithium-ion battery, 1 year manufacturer warranty for device and 6 months manufacturer warranty for in-box accessories including batteries from the date of purchase\n\n" +
                                "Android 11, v11.0 operating system,One UI 3.1, with 8nm Power Efficient Exynos850 (Octa Core 2.0GH\n",
                        "12990",
                        "27",
                        "9499",
                        "0",
                        "https://m.media-amazon.com/images/I/71r69Y7BSeL._SX522_.jpg",
                        "smartphone_3"));

        smartphonelist
                .add(new Product(
                        "iQOO Z6 5G",
                        "Chromatic Blue, 6GB RAM, 128GB Storage) | Snapdragon® 695 5G | 120Hz FHD+ Display | 5000mAh Battery",
                        "Snapdragon 695 5G Mobile Platform allows you to level up your performance with efficient 6nm Process, with an ANTUTU Score of 410563. Also, we get a 15% improved CPU performance & improved 30% GPU performance (As compared to Snapdragon 690G)\n\n" +
                                "iQOO Z6 5G comes with a large 5000mAh battery keeps going longer, for a more enjoyable gaming and video experience. It also comes 18W Fast Charging technology that juices up the battery quickly.\n",
                        "20990",
                        "19",
                        "16999",
                        "0",
                        "https://m.media-amazon.com/images/I/61wEaWM9K1L._SX522_.jpg",
                        "smartphone_4"));

        smartphonelist
                .add(new Product(
                        "Samsung Galaxy M32 5Gn",
                        "Sky Blue, 8GB RAM, 128GB Storage",
                        "MediaTek | Dimensity 720 Octa Core 2GHz Processor with the widest 12 band support for a True 5G experience\n\n" +
                                "16.55 centimeters (6.5-inch) TFT - Infinity V-cut display, HD+ resolution, 720 X 1600 pixels protected by Gorilla Glass 5\n\n" +
                                "Versatile Quad camera setup-48MP (F 1.8) main camera + 8MP (F2.2) Ultra wide camera+ 5MP (F2.4) depth camera + 2MP (2.4) Macro Camera| 13MP (F2.2) front camera\n",
                        "25990",
                        "27",
                        "18999",
                        "0",
                        "https://m.media-amazon.com/images/I/71os5DRhuSL._SY679_.jpg",
                        "smartphone_5"));

        smartphonelist
                .add(new Product(
                        "Tecno Spark 8C",
                        "Turquoise Cyan (3GB+64GB) | Upto 6GB RAM |90Hz Refresh Rate |6.6\" HD+ Display | 5000mAh |13MP Dual Camera| IPX2 Splash Resistant",
                        "90Hz high refresh rate for smoother scrolling and visual experience | 6.6\" HD+ Dot Notch display | 180Hz touch sampling rate for smooth touch response | No support for Africa's frequency bands\n\n" +
                                "Upto 6GB larger RAM (3GB LPDDR4x + 3GB Virtual RAM) with the help of memory fusion technology | Upto 45% improvement in launching apps, upto 15 apps support in background | 64GB eMMC 5.1 ROM extendable upto 256GB\n\n" +
                                "5000mAh battery with up to 89 days long standby | 23 hours Video playback or 53 hours Calling or 137 hours music playback | Sleep mode optimization, Ultra Battery saver mode for extreme backup\n",
                        "10999",
                        "27",
                        "7999",
                        "0",
                        "https://m.media-amazon.com/images/I/81kFQpwRonL._SX679_.jpg",
                        "smartphone_6"));

        productMap.put("Smartphone", smartphonelist);

        ArrayList<Product> tvList = new ArrayList<Product>();

        // TV
        tvList.add(new Product(
                "Redmi 80 cm",
                "(32 inches) HD Ready Smart LED TV | L32M6-RA (Black) (2021 Model) | With Android 11",
                "Resolution: HD Ready (1366x768) | Refresh Rate: 60 hertz | 178 Degree wide viewing angle\n\n" +
                        "Connectivity: 2 HDMI ports to connect set top box, Blu-Ray players, gaming console | 2 USB ports to connect hard drives and other USB devices | 3.5mm to connect your headphones | Bluetooth 5.0 to connect Bluetooth speakers, earphones and TWS earphones\n\n" +
                        "Sound: 20 Watts Powerful Stereo Speakers | Dolby Audio | DTS Virtual: X and DTS-HD | Dolby Atmos pass through ARC port\n\n" +
                        "Smart TV Features : Android TV 11 | Chromecast built-in | PatchWall 4 with IMDb integration | Kids Mode with Parental Lock | 75+ Free Live Channels\n",
                "24999",
                "44",
                "11000",
                "0",
                "https://m.media-amazon.com/images/I/71HcZHyEsTL._SX679_.jpg",
                "tv_1"));

        tvList.add(new Product(
                "OnePlus 80 cm",
                "(32 inches) Y Series HD Ready LED Smart Android TV 32Y1 (Black) (2020 Model)",
                "Resolution: HD Ready (1366x768) | Refresh Rate: 60 hertz\n\n" +
                        "Connectivity: 2 HDMI ports to connect set top box, Blu Ray players, gaming console | 2 USB ports to connect hard drives and other USB devices, Dimensions(TV With Stand) - 71.3cm*20cm*46.9cm, VESA Hole Pitch - 20cm*20cm\n\n" +
                        "Sound : 20 Watts Output | Dolby Audio\n\n" +
                        "Smart TV Features: Android TV 9.0 | OnePlus Connect | Google Assistant | Play Store | Chromecast | Shared Album | Supported Apps : Netflix, YouTube, Prime video | Content Calendar | OxygenPlay\n",
                "19999",
                "20",
                "15999",
                "0",
                "https://m.media-amazon.com/images/I/71vZypjNkPS._SX679_.jpg",
                "tv_2"));

        tvList.add(new Product(
                "Mi 80 cm",
                "(32 inches) HD Ready Android Smart LED TV 4A PRO | L32M5-AL (Black)",
                "Resolution: HD Ready Android TV (1366x768) | Refresh Rate: 60 hertz\n\n" +
                        "Connectivity: 3 HDMI ports to connect set top box, Blu Ray players, gaming console | 2 USB ports to connect hard drives and other USB devices\n\n" +
                        "Sound: 20 Watts Output | Dolby+ DTS-HD\n\n" +
                        "Smart TV Features : Built-In Wi-Fi | PatchWall | Netflix | Prime Video | Disney+Hotstar and more | Android TV 9.0 | Google Assistant, WIFI：2.4GHz 802.11 b/g/n\n",
                "18000",
                "12",
                "13990",
                "0",
                "http://img6a.flixcart.com/image/television/f/b/z/micromax-43x6300mhd-400x400-imaednxv8bgznhbx.jpeg",
                "tv_3"));

        tvList.add(new Product(
                "LED 3",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "19999",
                "18",
                "16499",
                "0",
                "https://m.media-amazon.com/images/I/71Z+l05eSIS._SX679_.jpg",
                "tv_4"));

        tvList.add(new Product(
                "Acer 80 cm",
                "(32 inches) Boundless series HD Ready Android Smart LED TV AR32AP2841HDFL (Black) (2021 Model) | With Frameless Design",
                "Resolution : HD Ready (1366x768) resolution | Refresh Rate : 60 Hertz | 178 Degree wide viewing angle\n\n" +
                        "Connectivity: 3 HDMI ports (HDMI 1 supports ARC) to connect personal computer, laptop, set top box, Blu-ray speakers or a gaming console | 2 USB ports to connect hard drives or other USB device\n\n" +
                        "Sound: 24 Watts Output | High Fidelity Speakers with Dolby Audio | Sound calibration by Pure Sound 2.0\n\n" +
                        "Smart TV Features : Google certified Android Tv｜Google Assistant | Chromecast built-in | Voice controlled Smart Remote | Hotkeys for Quick Access - Netflix, Prime Video, YouTube | Wifi 2.4 GHz | 5 Picture Mode | 1.5GB RAM | 8GB Storage | 64bit Quad Core Processor\n",
                "22990",
                "39",
                "13990",
                "0",
                "https://m.media-amazon.com/images/I/81kTY2YiPtL._SX679_.jpg",
                "tv_5"));

        tvList.add(new Product(
                "AmazonBasics 127cm",
                "(50 inch) 4K Ultra HD Smart LED Fire TV AB50U20PS (Black)",
                "Resolution: 4K Ultra HD (3840 x 2160) | Refresh Rate: 60 hertz | 178° wide viewing angle\n\n" +
                        "Connectivity: 3 HDMI 2.0 ports to connect set top box, Blu Ray players, gaming console | 1 USB 3.0 and 1 USB 2.0 ports to connect hard drives and other USB devices | IR Port to control connected devices like Soundbars, Receivers and Set top boxes\n\n" +
                        "Sound output: Inbuilt 20 Watts Powerful Speakers | Dolby Atmos\n\n" +
                        "Smart TV Features: Fire TV OS | Built in Alexa and Alexa voice controls | DTH Set-Top Box Integration to switch between DTH TV Channels and OTT apps\n",
                "56000",
                "41",
                "32999",
                "0",
                "https://m.media-amazon.com/images/I/71sFjIGl9UL._SX679_.jpg",
                "tv_6"));

        productMap.put("Television", tvList);

        ArrayList<Product> productlist = new ArrayList<Product>();

        // SmartWatch
        productlist
                .add(new Product(
                        "Apple Watch SE",
                        "(GPS + Cellular, 44mm) - Space Grey Aluminium Case with Midnight Sport Band - Regular",
                        "Stay connected to family and friends with calls, texts and email, even when you don’t have your phone\n\n" +
                                "Stream music and podcasts on the go, and leave your phone at home\n\n" +
                                "Take calls and reply to texts, right from your wrist\n\n" +
                                "Track your daily activity on Apple Watch and see your trends in the Fitness app on iPhone\n\n" +
                                "Track new tai chi and pilates workouts, in addition to favourites like running, yoga, swimming and dance\n",
                        "36000",
                        "10",
                        "32400",
                        "0",
                        "https://m.media-amazon.com/images/I/71ZyBh4LQuL._SX679_.jpg",
                        "smartwatch_1"));

        productlist
                .add(new Product(
                        "boAt Flash Edition Smartwatch",
                        "Activity Tracker,Multiple Sports Modes,Full Touch 1.3\" Screen,Sleep Monitor,Gesture, Camera & Music Control,IP68 Dust,Sweat & Splash Resistance(Lightning Black)",
                        "1.3\"(33mm) LCD display with a round dial that sports complete capacitive and responsive touch interface for effortless control.\n\n" +
                                "The health monitoring feature in the watch helps you keep a track of heart rate & blood oxygen levels.\n\n" +
                                "The daily activity tracker records daily steps taken, calories burnt and distances covered.\n\n" +
                                "10 active sports modes include: running, walking, cycling, climbing, yoga, basketball, football, badminton, skipping & swimming.\n",
                        "6990",
                        "66",
                        "2399",
                        "0",
                        "https://m.media-amazon.com/images/I/61xBnF7kD5L._SX679_.jpg",
                        "smartphone_2"));

        productlist
                .add(new Product(
                        "Crossbeats Ignite S3",
                        "Bluetooth Calling with Voice Assistant Metal Body 1.7\" HD IPS Display Smartwatch Spo2 Monitor Stress Management 24/7 Dynamic HR Tracking, Customizable Watch Screen(Carbon Black)",
                        "Talk through the watch: With in-built speaker & mic on the Ignite S3, you can quickly answer voice calls directly from the smartwatch or even dial using the dial pad on the watch. *2 days of battery if used with voice calling. 7 days on normal usage.\n\n" +
                                "Stress Management: Crossbeats brings in a newer health metric to the existing line up of health apps, Stress Management. It generates the stress graph based on the heart rate readings that can be directly checked on the watch.\n",
                        "9999",
                        "60",
                        "3999",
                        "0",
                        "https://m.media-amazon.com/images/I/61W7RSupm4L._SX522_.jpg",
                        "smartphone_3"));

        productlist
                .add(new Product(
                        "Fire-Boltt Ninja",
                        "Calling 1.69\" Full Touch Bluetooth Calling Smartwatch with 30 Sports Mode, SpO2, Heart Rate Monitoring & AI Voice Assistant (Black), Free Size ",
                        "【Bluetooth Calling Watch】- Fire-Boltt Ninja Calling enables you to make and receive calls directly from your watch via the built-in speaker and microphone. This smartwatch features a dial pad, option to access recent calls & sync your phone’s contacts.\n\n" +
                                "【SpO2 & Heart Rate Tracking】- Track Real Time Heart Rate on the go. Whether you are exercising or you do not feel right, tracking is just a click away. Featuring Blood Oxygen Tracking (SpO2) with optical sensors that give almost acurate results\n",
                        "7999",
                        "56",
                        "3498",
                        "0",
                        "https://m.media-amazon.com/images/I/61eQr+8ajUL._SX679_.jpg",
                        "smartwatch_4"));

        productlist
                .add(new Product(
                        "Noise ColorFit Pulse Grand",
                        "Smartwatch with 1.69\" HD Display, 60 Sports Modes, 150 Watch Faces, Fast Charge, Spo2, Stress, Sleep, Heart Rate Monitoring & IP68 Waterproof (Jet Black)",
                        "1.69\" grand display: Get the rich immersive viewing experience on the 1.69\" LCD display.\n\n" +
                                "60 sports modes: Take your pick from a wide range of 60 sports modes.\n\n" +
                                "Instant charge: Now enjoy more than a day’s worth/25 hours of battery in just 15 minutes of charge.\n\n" +
                                "150+ cloud-based & customisable watch faces: Choose from 150+ cloud-based and customisable watch faces and change your look to suit your outfit.\n\n" +
                                "Noise Health suite: Get valuable insights about your health from Noise Health\n",
                        "3999",
                        "38",
                        "2499",
                        "0",
                        "https://m.media-amazon.com/images/I/61ef2FzJTJL._SX679_.jpg",
                        "smartwatch_5"));

        productlist
                .add(new Product(
                        "Fire-Boltt Thunder",
                        "Bluetooth Calling Full Touch 1.32inch Amoled LCD Smartwatch with SpO2, Heart Rate & Sleep Monitoring, 30 Sports Modes (Black), Free Size",
                        "Bluetooth Calling Watch】- Fire-Boltt Thunder enables you to make and receive calls directly from your watch via the built-in speaker and microphone. This smartwatch features a dial pad, option to access recent calls & sync your phone’s contacts.\n\n" +
                                "【Full Health Cover】- Track Real Time Heart Rate on the go. Tracking is just a click away. With Blood Oxygen Tracking (SpO2) via optical sensors that give almost acurate results. Track your sleep and maintain a healthy lifestyle. Check your Temperature in this smartwatch anytime anywhere\n",
                        "12999",
                        "62",
                        "4999",
                        "0",
                        "https://m.media-amazon.com/images/I/61PUqnQVBFL._SX679_.jpg",
                        "smartwatch_6"));

        productMap.put("SmartWatch", productlist);


        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllFurnitures() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Table
        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "http://img6a.flixcart.com/image/coffee-table/q/f/4/ct15bl-mdf-royal-oak-dark-400x400-imaeehkd8xuheh2u.jpeg",
                        "table_1"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "15000",
                        "10",
                        "8000",
                        "0",
                        "http://img5a.flixcart.com/image/coffee-table/c/z/e/afr1096-sm-mango-wood-onlineshoppee-brown-400x400-imaea6c2bhwz8tns.jpeg",
                        "table_2"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "12999",
                        "19",
                        "7799",
                        "0",
                        "http://img5a.flixcart.com/image/coffee-table/u/n/p/brass-table0016-rosewood-sheesham-zameerwazeer-beige-400x400-imaedwk5ksph9ut2.jpeg",
                        "table_3"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "20000",
                        "10",
                        "15000",
                        "0",
                        "http://img6a.flixcart.com/image/coffee-table/v/h/h/side-tb-53-ad-particle-board-debono-acacia-dark-matt-400x400-imaecnctfgjahsnu.jpeg",
                        "table_4"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "13499",
                        "12",
                        "6999",
                        "0",
                        "http://img5a.flixcart.com/image/coffee-table/c/z/e/afr1096-sm-mango-wood-onlineshoppee-brown-400x400-imaea6c2bhwz8tns.jpeg",
                        "table_5"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "9999",
                        "12",
                        "6599",
                        "0",
                        "http://img5a.flixcart.com/image/coffee-table/k/y/h/1-particle-board-wood-an-wood-coffee-400x400-imae7uvzqsf4ynan.jpeg",
                        "table_6"));

        productMap.put("Tables", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "12000",
                        "0",
                        "http://img5a.flixcart.com/image/bean-bag/5/b/b/boss-moda-chair-br1088-comf-on-xxxl-400x400-imae9k78vg8gjh3q.jpeg",
                        "chair_1"));

        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "3600",
                        "20",
                        "1200",
                        "0",
                        "http://img6a.flixcart.com/image/office-study-chair/e/f/p/flversaossblu-stainless-steel-nilkamal-400x400-imaeeptqczc5kbjg.jpeg",
                        "chair_2"));

        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "15699",
                        "20",
                        "10999",
                        "0",
                        "http://img5a.flixcart.com/image/bean-bag/7/w/b/chr-01-fab-homez-xxxl-400x400-imae9qnbfwr9vkk4.jpeg",
                        "chair_3"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "12000",
                        "0",
                        "http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyhzefdzgz.jpeg",
                        "chair_4"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "4500",
                        "20",
                        "4000",
                        "0",
                        "http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyytefgvz7.jpeg",
                        "chair_5"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "6999",
                        "20",
                        "5999",
                        "0",
                        "http://img6a.flixcart.com/image/office-study-chair/j/y/q/adpn-d021-pp-adiko-400x400-imaee2vrg9bkkxjg.jpeg",
                        "chair_6"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "11299",
                        "20",
                        "10999",
                        "0",
                        "http://img6a.flixcart.com/image/office-study-chair/k/s/2/adxn-034-pu-leatherette-adiko-400x400-imaedpmyyyg8bdmv.jpeg",
                        "chair_7"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "15999",
                        "20",
                        "14000",
                        "0",
                        "http://img6a.flixcart.com/image/bean-bag/t/8/n/fk0100391-star-xxxl-400x400-imae72dsb5h2r9uj.jpeg",
                        "chair_8"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "18000",
                        "20",
                        "17000",
                        "0",
                        "http://img5a.flixcart.com/image/bean-bag/3/h/w/rydclassicgreenl-rockyard-large-400x400-imae6zfaz6qzj3jd.jpeg",
                        "chair_9"));

        productMap.put("Chairs", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "http://img5a.flixcart.com/image/collapsible-wardrobe/h/h/g/best-quality-3-5-feet-foldable-storage-cabinet-almirah-shelf-400x400-imaees5fq7wbndak.jpeg",
                        "almirah_1"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "4000",
                        "20",
                        "1999",
                        "0",
                        "http://img6a.flixcart.com/image/collapsible-wardrobe/d/n/s/cb265-carbon-steel-cbeeso-dark-beige-400x400-imaefn9vha2hm9qk.jpeg",
                        "almirah_2"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "5000",
                        "20",
                        "2000",
                        "0",
                        "http://img6a.flixcart.com/image/wardrobe-closet/b/v/3/srw-146-jute-pindia-blue-400x400-imaeb9g4y6tegzfn.jpeg",
                        "almirah_3"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "9000",
                        "20",
                        "8999",
                        "0",
                        "http://img6a.flixcart.com/image/cupboard-almirah/y/w/q/100009052-particle-board-housefull-mahogany-400x400-imaebazkwhv64p8q.jpeg",
                        "almirah_4"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "7499",
                        "20",
                        "5999",
                        "0",
                        "http://img5a.flixcart.com/image/collapsible-wardrobe/w/c/k/srw-116a-aluminium-pindia-maroon-wardrobe-400x400-imaeb9g4945dqunu.jpeg",
                        "almirah_5"));

        productlist
                .add(new Product(
                        "Metal Free Standing Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "7400",
                        "20",
                        "7000",
                        "0",
                        "http://img6a.flixcart.com/image/wardrobe-closet/f/b/p/srw-167-jute-pindia-purple-400x400-imaeb9g4d8uvatck.jpeg",
                        "almirah_6"));

        productMap.put("Almirah", productlist);

        productMap.put("Almirah", productlist);

        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllProducts(int productCategory) {

        if (productCategory == 0) {

            getAllElectronics();
        } else {

            getAllFurnitures();

        }

    }

}
