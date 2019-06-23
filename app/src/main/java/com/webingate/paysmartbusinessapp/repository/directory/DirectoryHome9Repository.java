package com.webingate.paysmartbusinessapp.repository.directory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.webingate.paysmartbusinessapp.object.DirectoryHome9CategoryVO;
import com.webingate.paysmartbusinessapp.object.DirectoryHome9FlightsVO;
import com.webingate.paysmartbusinessapp.object.DirectoryHome9PopularVO;
import com.webingate.paysmartbusinessapp.object.DirectoryHome9ProductsVO;
import com.webingate.paysmartbusinessapp.object.DirectoryHome9PromotionsVO;

import java.util.ArrayList;

public class DirectoryHome9Repository {

    public static ArrayList<DirectoryHome9CategoryVO> getCategoryList() {
        return new Gson().fromJson(categoryJson, new TypeToken<ArrayList<DirectoryHome9CategoryVO>>() {
        }.getType());
    }

    public static ArrayList<DirectoryHome9FlightsVO> getFlightsList() {
        return new Gson().fromJson(flightsJson, new TypeToken<ArrayList<DirectoryHome9FlightsVO>>() {
        }.getType());
    }

    public static ArrayList<DirectoryHome9PopularVO> getPopularList() {
        return new Gson().fromJson(popularJson, new TypeToken<ArrayList<DirectoryHome9PopularVO>>() {
        }.getType());
    }

    public static ArrayList<DirectoryHome9ProductsVO> getProductsList() {
        return new Gson().fromJson(productsJson, new TypeToken<ArrayList<DirectoryHome9ProductsVO>>() {
        }.getType());
    }

    public static ArrayList<DirectoryHome9ProductsVO> getDriverOptionsList() {
        return new Gson().fromJson(DriverOptionsJson, new TypeToken<ArrayList<DirectoryHome9ProductsVO>>() {
        }.getType());
    }
    public static ArrayList<DirectoryHome9ProductsVO> getfleetownerList() {
        return new Gson().fromJson(fleetownerJson, new TypeToken<ArrayList<DirectoryHome9ProductsVO>>() {
        }.getType());
    }
    public static ArrayList<DirectoryHome9ProductsVO> getticketagentList() {
        return new Gson().fromJson(ticketAgentJson, new TypeToken<ArrayList<DirectoryHome9ProductsVO>>() {
        }.getType());
    }
    public static ArrayList<DirectoryHome9ProductsVO> getbusinessownerList() {
        return new Gson().fromJson(businessownerJson, new TypeToken<ArrayList<DirectoryHome9ProductsVO>>() {
        }.getType());
    }
    public static ArrayList<DirectoryHome9ProductsVO> getBrandAmbassadorOptionsList() {
        return new Gson().fromJson(brandAmbassadorOptionsJson, new TypeToken<ArrayList<DirectoryHome9ProductsVO>>() {
        }.getType());
    }
    public static ArrayList<DirectoryHome9PromotionsVO> getPromotionsList() {
        return new Gson().fromJson(promotionsJson, new TypeToken<ArrayList<DirectoryHome9PromotionsVO>>() {
        }.getType());
    }
    private static String brandAmbassadorOptionsJson = "[{\n" +
            "  \"id\": \"product11\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "   \"name\": \"Drivers\"\n" +
            " },\n" +
            "{\n" +
            "  \"id\": \"product12\",\n" +
            "  \"icon\": \"home9_flight\",\n" +
            "  \"name\": \"Vehicles\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product13\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "  \"name\": \"Brand Ambassador Client\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product14\",\n" +
            "  \"icon\": \"home9_train\",\n" +
            "  \"name\": \"Statistics\"\n" +
            "},\n" +
            "  {\n" +
            "    \"id\": \"product2\",\n" +
            "    \"icon\": \"home9_hotel\",\n" +
            "    \"name\": \"Business Owner\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product7\",\n" +
            "    \"icon\": \"home9_bus\",\n" +
            "    \"name\": \"Ticket Agents\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product3\",\n" +
            "    \"icon\": \"cruise\",\n" +
            "    \"name\": \"Fleet Owners\"\n" +
            "  }\n" +
//            "  {\n" +
//            "    \"id\": \"product4\",\n" +
//            "    \"icon\": \"home9_activities\",\n" +
//            "    \"name\": \"Offers & discounts\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product5\",\n" +
//            "    \"icon\": \"home9_hotel\",\n" +
//            "    \"name\": \"Shop\"\n" +
//            "  },\n" +


//            "  {\n" +
//            "    \"id\": \"product6\",\n" +
//            "    \"icon\": \"home9_train\",\n" +
//            "    \"name\": \"Trains\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product8\",\n" +
//            "    \"icon\": \"home9_airport\",\n" +
//            "    \"name\": \"Airport Transport\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product9\",\n" +
//            "    \"icon\": \"home9_rental\",\n" +
//            "    \"name\": \"Car Rental\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "  \"id\": \"product10\",\n" +
//            "  \"icon\": \"home9_rental\",\n" +
//            "  \"name\": \"All Products\"\n" +
//            "}\n" +
            "]";

    private static String categoryJson = "[{\n" +
            "  \"id\": \"category1\",\n" +
            "  \"icon\": \"baseline_document_full_grey_24\",\n" +
            "  \"name\": \"Bills & Top-up\"\n" +
            "},\n" +
            "  {\n" +
            "    \"id\": \"category2\",\n" +
            "    \"icon\": \"baseline_topup_grey_24\",\n" +
            "    \"name\": \"Top-Up & Data Packages\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"category3\",\n" +
            "    \"icon\": \"baseline_movie_filter_grey_24\",\n" +
            "    \"name\": \"Movies\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"category4\",\n" +
            "    \"icon\": \"baseline_pay_later_24\",\n" +
            "    \"name\": \"Pay Later\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"category5\",\n" +
            "    \"icon\": \"baseline_save_card_black_24\",\n" +
            "    \"name\": \"International Data Plans\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"category6\",\n" +
            "    \"icon\": \"baseline_check_in_grey_24\",\n" +
            "    \"name\": \"Online Check-in\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"category7\",\n" +
            "    \"icon\": \"baseline_bell_40_grey_25\",\n" +
            "    \"name\": \"Price Alerts\"\n" +
            "  }\n" +
            "]";

    private static String flightsJson = "[{\n" +
            "  \"id\": \"flight1\",\n" +
            "  \"image\": \"home9_city_5\",\n" +
            "  \"country\": \"Seoul\",\n" +
            "  \"price\": \"35 $\",\n" +
            "  \"duration\": \"25Aug 30May2018\",\n" +
            "  \"description\": \"pet person staring\"\n" +
            "},\n" +
            "  {\n" +
            "    \"id\": \"flight2\",\n" +
            "    \"image\": \"home9_city_6\",\n" +
            "    \"country\": \"Kuala Lumpur\",\n" +
            "    \"price\": \"20 $\",\n" +
            "    \"duration\": \"25Aug 30May2018\",\n" +
            "    \"description\": \"pet person staring\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"flight3\",\n" +
            "    \"image\": \"sg_clarke_quay\",\n" +
            "    \"country\": \"Singapore\",\n" +
            "    \"price\": \"35 $\",\n" +
            "    \"duration\": \"25Aug 30May2018\",\n" +
            "    \"description\": \"pet person staring\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"flight4\",\n" +
            "    \"image\": \"home9_city_1\",\n" +
            "    \"country\": \"Seoul\",\n" +
            "    \"price\": \"35 $\",\n" +
            "    \"duration\": \"25Aug 30May2018\",\n" +
            "    \"description\": \"pet person staring\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"flight5\",\n" +
            "    \"image\": \"home9_city_2\",\n" +
            "    \"country\": \"Kuala Lumpur\",\n" +
            "    \"price\": \"20 $\",\n" +
            "    \"duration\": \"25Aug 30May2018\",\n" +
            "    \"description\": \"pet person staring\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"flight6\",\n" +
            "    \"image\": \"sg_clarke_quay\",\n" +
            "    \"country\": \"Singapore\",\n" +
            "    \"price\": \"35 $\",\n" +
            "    \"duration\": \"25Aug 30May2018\",\n" +
            "    \"description\": \"pet person staring\"\n" +
            "  }\n" +
            "]";

    private static String popularJson = "[{\n" +
            "  \"id\": \"popular1\",\n" +
            "  \"image\": \"home9_city_1\",\n" +
            "  \"name\": \"Jakarta\",\n" +
            "  \"place\": \"Metropolis Charm\"\n" +
            "},\n" +
            "  {\n" +
            "    \"id\": \"popular2\",\n" +
            "    \"image\": \"home9_city_2\",\n" +
            "    \"name\": \"Ubud\",\n" +
            "    \"place\": \"Artists' Den\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"popular3\",\n" +
            "    \"image\": \"home9_city_3\",\n" +
            "    \"name\": \"Penang\",\n" +
            "    \"place\": \"Interesting Vibes\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"popular4\",\n" +
            "    \"image\": \"home9_city_4\",\n" +
            "    \"name\": \"Malacca\",\n" +
            "    \"place\": \"Museum City\"\n" +
            "  }\n" +
            "]";

    private static String productsJson = "[{\n" +
            "  \"id\": \"product11\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "   \"name\": \"Get a Lyft\"\n" +
            " },\n" +
            "{\n" +
            "  \"id\": \"product12\",\n" +
            "  \"icon\": \"home9_flight\",\n" +
            "  \"name\": \"Flights\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product13\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "  \"name\": \"Hire a vehicle\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product14\",\n" +
            "  \"icon\": \"home9_train\",\n" +
            "  \"name\": \"Train\"\n" +
            "},\n" +
            "  {\n" +
            "    \"id\": \"product2\",\n" +
            "    \"icon\": \"home9_hotel\",\n" +
            "    \"name\": \"Hotels\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product7\",\n" +
            "    \"icon\": \"home9_bus\",\n" +
            "    \"name\": \"Bus\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product3\",\n" +
            "    \"icon\": \"cruise\",\n" +
            "    \"name\": \"Cruise\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product4\",\n" +
            "    \"icon\": \"home9_activities\",\n" +
            "    \"name\": \"Offers & discounts\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product5\",\n" +
            "    \"icon\": \"home9_hotel\",\n" +
            "    \"name\": \"Shop\"\n" +
            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product6\",\n" +
//            "    \"icon\": \"home9_train\",\n" +
//            "    \"name\": \"Trains\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product8\",\n" +
//            "    \"icon\": \"home9_airport\",\n" +
//            "    \"name\": \"Airport Transport\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product9\",\n" +
//            "    \"icon\": \"home9_rental\",\n" +
//            "    \"name\": \"Car Rental\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "  \"id\": \"product10\",\n" +
//            "  \"icon\": \"home9_rental\",\n" +
//            "  \"name\": \"All Products\"\n" +
//            "}\n" +
            "]";
    private static String fleetownerJson = "[{\n" +
            "  \"id\": \"product11\",\n" +
            "  \"icon\": \"baseline_person_outline_black_24\",\n" +
            "   \"name\": \"Drivers\"\n" +
            " },\n" +
            "{\n" +
            "  \"id\": \"product12\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "  \"name\": \"Vehicles\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product13\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "  \"name\": \"Driver vehicle\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product14\",\n" +
            "  \"icon\": \"home9_train\",\n" +
            "  \"name\": \"Statistics\"\n" +
            "},\n" +
            "  {\n" +
            "    \"id\": \"product2\",\n" +
            "    \"icon\": \"home9_hotel\",\n" +
            "    \"name\": \"Ticket Agent\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product7\",\n" +
            "    \"icon\": \"team_icon\",\n" +
            "    \"name\": \"Staff\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product3\",\n" +
            "    \"icon\": \"cruise\",\n" +
            "    \"name\": \"Routes\"\n" +
            "  }\n" +
//            "  {\n" +
//            "    \"id\": \"product4\",\n" +
//            "    \"icon\": \"home9_activities\",\n" +
//            "    \"name\": \"Offers & discounts\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product5\",\n" +
//            "    \"icon\": \"home9_hotel\",\n" +
//            "    \"name\": \"Shop\"\n" +
//            "  },\n" +


//            "  {\n" +
//            "    \"id\": \"product6\",\n" +
//            "    \"icon\": \"home9_train\",\n" +
//            "    \"name\": \"Trains\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product8\",\n" +
//            "    \"icon\": \"home9_airport\",\n" +
//            "    \"name\": \"Airport Transport\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product9\",\n" +
//            "    \"icon\": \"home9_rental\",\n" +
//            "    \"name\": \"Car Rental\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "  \"id\": \"product10\",\n" +
//            "  \"icon\": \"home9_rental\",\n" +
//            "  \"name\": \"All Products\"\n" +
//            "}\n" +
            "]";
    private static String businessownerJson = "[{\n" +
            "  \"id\": \"product11\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "   \"name\": \"Drivers\"\n" +
            " },\n" +
            "{\n" +
            "  \"id\": \"product12\",\n" +
            "  \"icon\": \"home9_flight\",\n" +
            "  \"name\": \"Vehicles\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product13\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "  \"name\": \"Driver vehicle\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product14\",\n" +
            "  \"icon\": \"home9_train\",\n" +
            "  \"name\": \"Statistics\"\n" +
            "},\n" +
            "  {\n" +
            "    \"id\": \"product2\",\n" +
            "    \"icon\": \"home9_hotel\",\n" +
            "    \"name\": \"Ticket Agent\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product7\",\n" +
            "    \"icon\": \"home9_bus\",\n" +
            "    \"name\": \"Staff\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product3\",\n" +
            "    \"icon\": \"cruise\",\n" +
            "    \"name\": \"Routes\"\n" +
            "  }\n" +
//            "  {\n" +
//            "    \"id\": \"product4\",\n" +
//            "    \"icon\": \"home9_activities\",\n" +
//            "    \"name\": \"Offers & discounts\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product5\",\n" +
//            "    \"icon\": \"home9_hotel\",\n" +
//            "    \"name\": \"Shop\"\n" +
//            "  },\n" +


//            "  {\n" +
//            "    \"id\": \"product6\",\n" +
//            "    \"icon\": \"home9_train\",\n" +
//            "    \"name\": \"Trains\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product8\",\n" +
//            "    \"icon\": \"home9_airport\",\n" +
//            "    \"name\": \"Airport Transport\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product9\",\n" +
//            "    \"icon\": \"home9_rental\",\n" +
//            "    \"name\": \"Car Rental\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "  \"id\": \"product10\",\n" +
//            "  \"icon\": \"home9_rental\",\n" +
//            "  \"name\": \"All Products\"\n" +
//            "}\n" +
            "]";
    private static String DriverOptionsJson = "[{\n" +
            "  \"id\": \"product11\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "   \"name\": \"Current trips\"\n" +
            " },\n" +
            "{\n" +
            "  \"id\": \"product12\",\n" +
            "  \"icon\": \"home9_flight\",\n" +
            "  \"name\": \"Trip\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product13\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "  \"name\": \"My Location\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product14\",\n" +
            "  \"icon\": \"home9_train\",\n" +
            "  \"name\": \"Assign Vehicle\"\n" +
            "},\n" +
            "  {\n" +
            "    \"id\": \"product2\",\n" +
            "    \"icon\": \"home9_hotel\",\n" +
            "    \"name\": \"Statistics\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product7\",\n" +
            "    \"icon\": \"home9_bus\",\n" +
            "    \"name\": \"SOS\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"product3\",\n" +
            "    \"icon\": \"cruise\",\n" +
            "    \"name\": \"Contact COC\"\n" +
            "  }\n" +
//            "  {\n" +
//            "    \"id\": \"product4\",\n" +
//            "    \"icon\": \"home9_activities\",\n" +
//            "    \"name\": \"Offers & discounts\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product5\",\n" +
//            "    \"icon\": \"home9_hotel\",\n" +
//            "    \"name\": \"Shop\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product6\",\n" +
//            "    \"icon\": \"home9_train\",\n" +
//            "    \"name\": \"Trains\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product8\",\n" +
//            "    \"icon\": \"home9_airport\",\n" +
//            "    \"name\": \"Airport Transport\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "    \"id\": \"product9\",\n" +
//            "    \"icon\": \"home9_rental\",\n" +
//            "    \"name\": \"Car Rental\"\n" +
//            "  },\n" +
//            "  {\n" +
//            "  \"id\": \"product10\",\n" +
//            "  \"icon\": \"home9_rental\",\n" +
//            "  \"name\": \"All Products\"\n" +
//            "}\n" +
            "]";
    private static String ticketAgentJson = "[{\n" +
            "  \"id\": \"product11\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "   \"name\": \"Current Ticket\"\n" +
            " },\n" +
            "{\n" +
            "  \"id\": \"product12\",\n" +
            "  \"icon\": \"home9_flight\",\n" +
            "  \"name\": \"Booking Ticket\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product13\",\n" +
            "  \"icon\": \"home9_rental\",\n" +
            "  \"name\": \"Fleet Owner\"\n" +
            "},\n" +
            " {\n" +
            "  \"id\": \"product14\",\n" +
            "  \"icon\": \"home9_train\",\n" +
            "  \"name\": \"Business Owner\"\n" +
            "},\n" +
            "  {\n" +
            "    \"id\": \"product2\",\n" +
            "    \"icon\": \"home9_hotel\",\n" +
            "    \"name\": \"Modify Ticket\"\n" +
           "}\n" +
            "]";
    private static String promotionsJson = "[\n" +
            "  {\n" +
            "    \"id\": \"promotion1\",\n" +
            "    \"image\": \"home9_promo_1\",\n" +
            "    \"name\": \"Discoutn Coupon\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"promotion2\",\n" +
            "    \"image\": \"home9_promo_2\",\n" +
            "    \"name\": \"Discoutn Coupon\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"promotion3\",\n" +
            "    \"image\": \"home9_promo_3\",\n" +
            "    \"name\": \"Discoutn Coupon\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"promotion4\",\n" +
            "    \"image\": \"home9_promo_1\",\n" +
            "    \"name\": \"Discoutn Coupon\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"promotion5\",\n" +
            "    \"image\": \"home9_promo_2\",\n" +
            "    \"name\": \"Discoutn Coupon\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"promotion6\",\n" +
            "    \"image\": \"home9_promo_3\",\n" +
            "    \"name\": \"Discoutn Coupon\"\n" +
            "  }\n" +
            "]";

}
