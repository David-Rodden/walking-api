package org.powbot.dax.shared.helpers;

import org.powbot.api.rt4.CacheVarbitConfig;
import org.powbot.api.rt4.Varpbits;

public class VarbitHelper {

    public enum Varbits
    {
        /*
         * If chatbox is transparent or not
         */
        TRANSPARENT_CHATBOX(4608),

        /*
         * If the player has an active stamina potion effect or not
         */
        RUN_SLOWED_DEPLETION_ACTIVE(25),

        /**
         * If scrollbar in resizable mode chat is on the left
         */
        CHAT_SCROLLBAR_ON_LEFT(6374),

        /**
         * Runepouch
         */
        RUNE_POUCH_RUNE1(29),
        RUNE_POUCH_RUNE2(1622),
        RUNE_POUCH_RUNE3(1623),
        RUNE_POUCH_AMOUNT1(1624),
        RUNE_POUCH_AMOUNT2(1625),
        RUNE_POUCH_AMOUNT3(1626),

        /**
         * Prayers
         */
        QUICK_PRAYER(4103),
        PRAYER_THICK_SKIN(4104),
        PRAYER_BURST_OF_STRENGTH(4105),
        PRAYER_CLARITY_OF_THOUGHT(4106),
        PRAYER_SHARP_EYE(4122),
        PRAYER_MYSTIC_WILL(4123),
        PRAYER_ROCK_SKIN(4107),
        PRAYER_SUPERHUMAN_STRENGTH(4108),
        PRAYER_IMPROVED_REFLEXES(4109),
        PRAYER_RAPID_RESTORE(4110),
        PRAYER_RAPID_HEAL(4111),
        PRAYER_PROTECT_ITEM(4112),
        PRAYER_HAWK_EYE(4124),
        PRAYER_MYSTIC_LORE(4125),
        PRAYER_STEEL_SKIN(4113),
        PRAYER_ULTIMATE_STRENGTH(4114),
        PRAYER_INCREDIBLE_REFLEXES(4115),
        PRAYER_PROTECT_FROM_MAGIC(4116),
        PRAYER_PROTECT_FROM_MISSILES(4117),
        PRAYER_PROTECT_FROM_MELEE(4118),
        PRAYER_EAGLE_EYE(4126),
        PRAYER_MYSTIC_MIGHT(4127),
        PRAYER_RETRIBUTION(4119),
        PRAYER_REDEMPTION(4120),
        PRAYER_SMITE(4121),
        PRAYER_CHIVALRY(4128),
        PRAYER_PIETY(4129),
        PRAYER_PRESERVE(5466),
        PRAYER_RIGOUR(5464),
        PRAYER_AUGURY(5465),

        /**
         * Diary Entries
         */
        DIARY_ARDOUGNE_EASY(4458),
        DIARY_ARDOUGNE_MEDIUM(4459),
        DIARY_ARDOUGNE_HARD(4460),
        DIARY_ARDOUGNE_ELITE(4461),

        DIARY_DESERT_EASY(4483),
        DIARY_DESERT_MEDIUM(4484),
        DIARY_DESERT_HARD(4485),
        DIARY_DESERT_ELITE(4486),

        DIARY_FALADOR_EASY(4462),
        DIARY_FALADOR_MEDIUM(4463),
        DIARY_FALADOR_HARD(4464),
        DIARY_FALADOR_ELITE(4465),

        DIARY_FREMENNIK_EASY(4491),
        DIARY_FREMENNIK_MEDIUM(4492),
        DIARY_FREMENNIK_HARD(4493),
        DIARY_FREMENNIK_ELITE(4494),

        DIARY_KANDARIN_EASY(4475),
        DIARY_KANDARIN_MEDIUM(4476),
        DIARY_KANDARIN_HARD(4477),
        DIARY_KANDARIN_ELITE(4478),

        DIARY_KARAMJA_EASY(3578),
        DIARY_KARAMJA_MEDIUM(3599),
        DIARY_KARAMJA_HARD(3611),
        DIARY_KARAMJA_ELITE(4566),

        DIARY_KOUREND_EASY(7925),
        DIARY_KOUREND_MEDIUM(7926),
        DIARY_KOUREND_HARD(7927),
        DIARY_KOUREND_ELITE(7928),

        DIARY_LUMBRIDGE_EASY(4495),
        DIARY_LUMBRIDGE_MEDIUM(4496),
        DIARY_LUMBRIDGE_HARD(4497),
        DIARY_LUMBRIDGE_ELITE(4498),

        DIARY_MORYTANIA_EASY(4487),
        DIARY_MORYTANIA_MEDIUM(4488),
        DIARY_MORYTANIA_HARD(4489),
        DIARY_MORYTANIA_ELITE(4490),

        DIARY_VARROCK_EASY(4479),
        DIARY_VARROCK_MEDIUM(4480),
        DIARY_VARROCK_HARD(4481),
        DIARY_VARROCK_ELITE(4482),

        DIARY_WESTERN_EASY(4471),
        DIARY_WESTERN_MEDIUM(4472),
        DIARY_WESTERN_HARD(4473),
        DIARY_WESTERN_ELITE(4474),

        DIARY_WILDERNESS_EASY(4466),
        DIARY_WILDERNESS_MEDIUM(4467),
        DIARY_WILDERNESS_HARD(4468),
        DIARY_WILDERNESS_ELITE(4469),

        /**
         * Kourend house favours
         */
        KOUREND_FAVOR_ARCEUUS(4896),
        KOUREND_FAVOR_HOSIDIUS(4895),
        KOUREND_FAVOR_LOVAKENGJ(4898),
        KOUREND_FAVOR_PISCARILIUS(4899),
        KOUREND_FAVOR_SHAYZIEN(4894),

        /**
         * Equipped weapon type
         */
        EQUIPPED_WEAPON_TYPE(357),

        /**
         * Defensive casting mode
         */
        DEFENSIVE_CASTING_MODE(2668),

        /**
         * Options
         */
        SIDE_PANELS(4607),

        /**
         * Herbiboar Trails
         */
        HB_TRAIL_31303(5737),
        HB_TRAIL_31306(5738),
        HB_TRAIL_31309(5739),
        HB_TRAIL_31312(5740),
        HB_TRAIL_31315(5741),
        HB_TRAIL_31318(5742),
        HB_TRAIL_31321(5743),
        HB_TRAIL_31324(5744),
        HB_TRAIL_31327(5745),
        HB_TRAIL_31330(5746),

        HB_TRAIL_31333(5768),
        HB_TRAIL_31336(5769),
        HB_TRAIL_31339(5770),
        HB_TRAIL_31342(5771),
        HB_TRAIL_31345(5772),
        HB_TRAIL_31348(5773),
        HB_TRAIL_31351(5774),
        HB_TRAIL_31354(5775),
        HB_TRAIL_31357(5776),
        HB_TRAIL_31360(5777),

        HB_TRAIL_31363(5747),
        HB_TRAIL_31366(5748),
        HB_TRAIL_31369(5749),
        HB_TRAIL_31372(5750),

        HB_FINISH(5766),
        HB_STARTED(5767), //not working

        /**
         * Barbarian Assault
         */
        IN_GAME_BA(3923),
        BA_GC(4768),

        /**
         * 0 = Outside wilderness
         * 1 = In wilderness
         */
        IN_WILDERNESS(5963),

        /**
         * Fishing Trawler
         * FISHING_TRAWLER_ACTIVITY Expected values: 0-255
         */
        FISHING_TRAWLER_ACTIVITY(3377),

        /**
         * Blast Furnace Bar Dispenser
         *
         * These are the expected values:
         *	0 = No bars being processed
         *	1 = Ores are being processed on the conveyor belt, bar dispenser cannot be checked
         *	2 = Bars are cooling down
         *	3 = Bars can be collected
         */
        BAR_DISPENSER(936),

        /**
         * Motherlode mine sack
         */
        SACK_NUMBER(5558),
        SACK_UPGRADED(5556),

        /**
         * Experience tracker
         *
         * EXPERIENCE_TRACKER_POSITION expected values:
         *   0 = Right
         *   1 = Middle
         *   2 = Left
         */
        EXPERIENCE_TRACKER_POSITION(4692),
        EXPERIENCE_TRACKER_COUNTER(4697),
        EXPERIENCE_TRACKER_PROGRESS_BAR(4698),

        /**
         * Experience drop color
         */
        EXPERIENCE_DROP_COLOR(4695),

        /**
         * Tithe Farm
         */
        TITHE_FARM_SACK_AMOUNT(4900),
        TITHE_FARM_SACK_ICON(5370),
        TITHE_FARM_POINTS(4893),

        /**
         * Blast Mine
         */
        BLAST_MINE_COAL(4924),
        BLAST_MINE_GOLD(4925),
        BLAST_MINE_MITHRIL(4926),
        BLAST_MINE_ADAMANTITE(4921),
        BLAST_MINE_RUNITE(4922),

        /**
         * Raids
         */
        IN_RAID(5432),
        TOTAL_POINTS(5431),
        PERSONAL_POINTS(5422),
        RAID_PARTY_SIZE(5424),

        /**
         * Making Friends with My Arm fire pits
         *
         * Expected values:
         *  0 = Not built
         *  1 = Built
         */
        FIRE_PIT_GIANT_MOLE(6532),
        FIRE_PIT_LUMBRIDGE_SWAMP(6533),
        FIRE_PIT_MOS_LE_HARMLESS(6544),

        /**
         * Theatre of Blood 1=In Party, 2=Inside/Spectator, 3=Dead Spectating
         */
        THEATRE_OF_BLOOD(6440),

        /**
         * Nightmare Zone
         */
        NMZ_ABSORPTION(3956),
        NMZ_POINTS(3949),

        /**
         * Blast Furnace
         */
        BLAST_FURNACE_COPPER_ORE(959),
        BLAST_FURNACE_TIN_ORE(950),
        BLAST_FURNACE_IRON_ORE(951),
        BLAST_FURNACE_COAL(949),
        BLAST_FURNACE_MITHRIL_ORE(952),
        BLAST_FURNACE_ADAMANTITE_ORE(953),
        BLAST_FURNACE_RUNITE_ORE(954),
        BLAST_FURNACE_SILVER_ORE(956),
        BLAST_FURNACE_GOLD_ORE(955),

        BLAST_FURNACE_BRONZE_BAR(941),
        BLAST_FURNACE_IRON_BAR(942),
        BLAST_FURNACE_STEEL_BAR(943),
        BLAST_FURNACE_MITHRIL_BAR(944),
        BLAST_FURNACE_ADAMANTITE_BAR(945),
        BLAST_FURNACE_RUNITE_BAR(946),
        BLAST_FURNACE_SILVER_BAR(948),
        BLAST_FURNACE_GOLD_BAR(947),

        BLAST_FURNACE_COFFER(5357),

        /**
         * Pyramid plunder
         */
        PYRAMID_PLUNDER_TIMER(2375),
        PYRAMID_PLUNDER_ROOM(2377),

        /**
         * Barrows
         */
        BARROWS_KILLED_AHRIM(457),
        BARROWS_KILLED_DHAROK(458),
        BARROWS_KILLED_GUTHAN(459),
        BARROWS_KILLED_KARIL(460),
        BARROWS_KILLED_TORAG(461),
        BARROWS_KILLED_VERAC(462),
        BARROWS_REWARD_POTENTIAL(463),
        BARROWS_NPCS_SLAIN(464),

        /**
         * Spicy stew ingredients
         */
        SPICY_STEW_RED_SPICES(1879),
        SPICY_STEW_YELLOW_SPICES(1880),
        SPICY_STEW_BROWN_SPICES(1881),
        SPICY_STEW_ORANGE_SPICES(1882),

        /**
         * Multicombat area
         */
        MULTICOMBAT_AREA(4605),

        /**
         * Kingdom Management
         */
        KINGDOM_FAVOR(72),
        KINGDOM_COFFER(74),

        /**
         * The Hand in the Sand quest status
         */
        QUEST_THE_HAND_IN_THE_SAND(1527),

        /**
         * Daily Tasks (Collection availability)
         */
        DAILY_HERB_BOXES_COLLECTED(3961),
        DAILY_STAVES_COLLECTED(4539),
        DAILY_ESSENCE_COLLECTED(4547),
        DAILY_RUNES_COLLECTED(4540),
        DAILY_SAND_COLLECTED(4549),
        DAILY_FLAX_STATE(4559),
        DAILY_ARROWS_STATE(4563),
        /**
         * This varbit tracks how much bonemeal has been redeemed from Robin
         * The player gets 13 for each diary completed above and including Medium, for a maxiumum of 39
         */
        DAILY_BONEMEAL_STATE(4543),

        DAILY_DYNAMITE_COLLECTED(7939),

        /**
         * Fairy Ring
         */
        FAIR_RING_LAST_DESTINATION(5374),
        FAIRY_RING_DIAL_ADCB(3985), //Left dial
        FAIRY_RIGH_DIAL_ILJK(3986), //Middle dial
        FAIRY_RING_DIAL_PSRQ(3987), //Right dial

        /**
         * Transmog controllers for farming
         */
        FARMING_4771(4771),
        FARMING_4772(4772),
        FARMING_4773(4773),
        FARMING_4774(4774),
        FARMING_4775(4775),
        FARMING_7904(7904),
        FARMING_7905(7905),
        FARMING_7906(7906),
        FARMING_7907(7907),
        FARMING_7908(7908),
        FARMING_7909(7909),
        FARMING_7910(7910),
        FARMING_7911(7911),

        /**
         * Transmog controllers for grapes
         */
        GRAPES_4953(4953),
        GRAPES_4954(4954),
        GRAPES_4955(4955),
        GRAPES_4956(4956),
        GRAPES_4957(4957),
        GRAPES_4958(4958),
        GRAPES_4959(4959),
        GRAPES_4960(4960),
        GRAPES_4961(4961),
        GRAPES_4962(4962),
        GRAPES_4963(4963),
        GRAPES_4964(4964),

        /**
         * Automatically weed farming patches
         */
        AUTOWEED(5557),

        /**
         * The varbit that stores the players {@code AccountType}.
         */
        ACCOUNT_TYPE(1777),

        /**
         * The varbit that stores the oxygen percentage for player
         */
        OXYGEN_LEVEL(5811),

        /**
         * Corp beast damage
         */
        CORP_DAMAGE(999),

        /**
         * Toggleable slayer unlocks
         */
        SUPERIOR_ENABLED(5362),
        FOSSIL_ISLAND_WYVERN_DISABLE(6251),

        CURRENT_BANK_TAB(4150),
        INVENTORY_ITEM_OPTIONS(10079),

        WORLDHOPPER_FAVROITE_1(4597),
        WORLDHOPPER_FAVROITE_2(4598),

        /**
         * Vengeance is active
         */
        VENGEANCE_ACTIVE(2450),

        /**
         * Spell cooldowns
         */
        VENGEANCE_COOLDOWN(2451),

        /**
         * Amount of items in each bank tab
         */
        BANK_TAB_ONE_COUNT(4171),
        BANK_TAB_TWO_COUNT(4172),
        BANK_TAB_THREE_COUNT(4173),
        BANK_TAB_FOUR_COUNT(4174),
        BANK_TAB_FIVE_COUNT(4175),
        BANK_TAB_SIX_COUNT(4176),
        BANK_TAB_SEVEN_COUNT(4177),
        BANK_TAB_EIGHT_COUNT(4178),
        BANK_TAB_NINE_COUNT(4179),

        /**
         * Type of GE offer currently being created
         * 0 = buy
         * 1 = sell
         */
        GE_OFFER_CREATION_TYPE(4397),

        /**
         * The active tab within the quest interface
         */
        QUEST_TAB(8168),

        /**
         * Explorer ring
         */
        EXPLORER_RING_ALCHTYPE(5398),
        EXPLORER_RING_TELEPORTS(4552),
        EXPLORER_RING_ALCHS(4554),
        EXPLORER_RING_RUNENERGY(4553),

        WINTERTODT_TIMER(7980),

        /**
         * Twisted league
         */
        TWISTED_LEAGUE_RELIC_1(10049),
        TWISTED_LEAGUE_RELIC_2(10050),
        TWISTED_LEAGUE_RELIC_3(10051),
        TWISTED_LEAGUE_RELIC_4(10052),
        TWISTED_LEAGUE_RELIC_5(10053),

        /**
         * STASH Units
         */
        STASH_UNIT_29006(5245),
        STASH_UNIT_29036(5277),
        STASH_UNIT_29023(5263),
        STASH_UNIT_28983(5221),
        STASH_UNIT_29007(5246),
        STASH_UNIT_29034(5275),
        STASH_UNIT_29052(5294),
        STASH_UNIT_29046(5288),
        STASH_UNIT_29045(5287),
        STASH_UNIT_29043(5285),
        STASH_UNIT_29041(5283),
        STASH_UNIT_29050(5292),
        STASH_UNIT_29058(5300),
        STASH_UNIT_29053(5295),
        STASH_UNIT_29025(5266),
        STASH_UNIT_29021(5261),
        STASH_UNIT_28991(5230),
        STASH_UNIT_28995(5234),
        STASH_UNIT_28993(5232),
        STASH_UNIT_29004(5243),
        STASH_UNIT_29049(5291),
        STASH_UNIT_29024(5265),
        STASH_UNIT_28996(5235),
        STASH_UNIT_28992(5231),
        STASH_UNIT_29011(5251),
        STASH_UNIT_28994(5233),
        STASH_UNIT_29039(5280),
        STASH_UNIT_28975(5213),
        STASH_UNIT_28977(5215),
        STASH_UNIT_29010(5250),
        STASH_UNIT_29038(5279),
        STASH_UNIT_28971(5209),
        STASH_UNIT_29027(5268),
        STASH_UNIT_28962(5200),
        STASH_UNIT_29037(5278),
        STASH_UNIT_29002(5241),
        STASH_UNIT_28979(5217),
        STASH_UNIT_28990(5229),
        STASH_UNIT_29030(5271),
        STASH_UNIT_28974(5212),
        STASH_UNIT_28978(5216),
        STASH_UNIT_29001(5240),
        STASH_UNIT_29015(5255),
        STASH_UNIT_29035(5276),
        STASH_UNIT_29017(5257),
        STASH_UNIT_29048(5290),
        STASH_UNIT_28998(5237),
        STASH_UNIT_29003(5242),
        STASH_UNIT_29016(5256),
        STASH_UNIT_29028(5269),
        STASH_UNIT_29047(5289),
        STASH_UNIT_29014(5254),
        STASH_UNIT_28984(5222),
        STASH_UNIT_28973(5211),
        STASH_UNIT_29032(5273),
        STASH_UNIT_29057(5299),
        STASH_UNIT_29054(5296),
        STASH_UNIT_29033(5274),
        STASH_UNIT_29019(5259),
        STASH_UNIT_28963(5201),
        STASH_UNIT_28969(5207),
        STASH_UNIT_28976(5214),
        STASH_UNIT_29051(5293),
        STASH_UNIT_28964(5202),
        STASH_UNIT_28972(5210),
        STASH_UNIT_29029(5270),
        STASH_UNIT_29013(5253),
        STASH_UNIT_29026(5267),
        STASH_UNIT_29060(5302),
        STASH_UNIT_28959(5197),
        STASH_UNIT_28960(5198),
        STASH_UNIT_29008(5247),
        STASH_UNIT_29059(5301),
        STASH_UNIT_28968(5206),
        STASH_UNIT_28966(5204),
        STASH_UNIT_28989(5228),
        STASH_UNIT_29005(5244),
        STASH_UNIT_28967(5205),
        STASH_UNIT_28985(5223),
        STASH_UNIT_29056(5298),
        STASH_UNIT_29000(5239),
        STASH_UNIT_28958(5196),
        STASH_UNIT_28986(5224),
        STASH_UNIT_28970(5208),
        STASH_UNIT_29055(5297),
        STASH_UNIT_29009(5249),
        STASH_UNIT_29040(5282),
        STASH_UNIT_29012(5252),
        STASH_UNIT_28999(5238),
        STASH_UNIT_28982(5220),
        STASH_UNIT_28965(5203),
        STASH_UNIT_28981(5219),
        STASH_UNIT_29022(5262),
        STASH_UNIT_28980(5218),
        STASH_UNIT_29018(5258),
        STASH_UNIT_28997(5236),
        STASH_UNIT_28961(5199),
        STASH_UNIT_29020(5260),
        STASH_UNIT_29031(5272),
        STASH_UNIT_28987(5226),
        STASH_UNIT_28988(5227),
        STASH_UNIT_29044(5286),
        STASH_UNIT_29042(5284),
        STASH_UNIT_34647(7970),
        STASH_UNIT_34736(8254),
        STASH_UNIT_34737(8255),
        STASH_UNIT_34738(8256),
        STASH_UNIT_34739(8257);

        /**
         * The raw varbit ID.
         */
        Varbits(int id){
            this.varBit = Varpbits.varpbit(id);
        }
    }


    private enum KOUREND_FAVOR {
        ARCEUUS(4896),
        HOSIDIUS(4895),
        LOVAKENGJ(4898),
        PISCARILIUS(4899),
        SHAYZIEN(4894);
        int var;
        KOUREND_FAVOR(int var){
            this.var = var;
        }

        public int getVar(){
            return var;
        }

        public int getValue(){
            return Varpbits.value(var);
        }
    }

    public static int getMiscellaniaFavor(){
        return Varpbits.value(72);
    }

    public static int getMiscellaniaScore(){
        return Varpbits.value(71);
    }

    public static int getMiscellaniaCoffer(){
        return Varpbits.value(74);
    }

    public static boolean hasPlacedLumbridgeSwampsRope(){
        return Varpbits.value(279);
    }

    public static int getHosidiusFavor(){
        return (int) (KOUREND_FAVOR.HOSIDIUS.getValue() * .1);
    }

    public static int getArceuusFavor(){
        return (int) (KOUREND_FAVOR.ARCEUUS.getValue() * .1);
    }

    public static int getShayzienFavor(){
        return (int) (KOUREND_FAVOR.SHAYZIEN.getValue() * .1);
    }

    public static int getPiscariliusFavor(){
        return KOUREND_FAVOR.PISCARILIUS.getValue();
    }

    public static int getLovakengjFavor(){
        return KOUREND_FAVOR.LOVAKENGJ.getValue();
    }

    public static boolean hasOpenedLumbridgeCavesShortcut(){
        return Varpbits.value(538) > 0;
    }

    public static boolean canUseFairyRings(){
        return Varpbits.value(2328) > 0;
    }

    public static boolean hasPermanentlyUnlockedDragontoothIsland(){
        return false;
    }


}
