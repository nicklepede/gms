package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.biid;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class Field extends AbstractSafeParcelable {
    public final String aS;
    public final int aT;
    public final Boolean aU;
    public static final Parcelable.Creator CREATOR = new biid();
    public static final Field a = new Field("activity", 1);
    public static final Field b = new Field("sleep_segment_type", 1);
    public static final Field c = new Field("confidence", 2);
    public static final Field d = new Field("steps", 1);

    @Deprecated
    public static final Field e = new Field("step_length", 2);
    public static final Field f = new Field("duration", 1);
    public static final Field g = b("duration");
    public static final Field h = new Field("activity_duration.ascending", 4);
    public static final Field i = new Field("activity_duration.descending", 4);
    public static final Field j = new Field("bpm", 2);
    public static final Field k = new Field("respiratory_rate", 2);
    public static final Field l = new Field("latitude", 2);
    public static final Field m = new Field("longitude", 2);
    public static final Field n = new Field("accuracy", 2);
    public static final Field o = a("altitude");
    public static final Field p = new Field("distance", 2);
    public static final Field q = new Field("height", 2);
    public static final Field r = new Field("weight", 2);
    public static final Field s = new Field("percentage", 2);
    public static final Field t = new Field("speed", 2);
    public static final Field u = new Field("rpm", 2);
    public static final Field v = new Field("google.android.fitness.GoalV2", 7);
    public static final Field w = new Field("google.android.fitness.Device", 7);
    public static final Field x = new Field("revolutions", 1);
    public static final Field y = new Field("calories", 2);
    public static final Field z = new Field("watts", 2);
    public static final Field A = new Field("volume", 2);
    public static final Field B = b("meal_type");
    public static final Field C = new Field("food_item", 3, true);
    public static final Field D = new Field("nutrients", 4);
    public static final Field E = new Field("exercise", 3);
    public static final Field F = b("repetitions");
    public static final Field G = a("resistance");
    public static final Field H = b("resistance_type");
    public static final Field I = new Field("num_segments", 1);
    public static final Field J = new Field("average", 2);
    public static final Field K = new Field("max", 2);
    public static final Field L = new Field("min", 2);
    public static final Field M = new Field("low_latitude", 2);
    public static final Field N = new Field("low_longitude", 2);
    public static final Field O = new Field("high_latitude", 2);
    public static final Field P = new Field("high_longitude", 2);
    public static final Field Q = new Field("occurrences", 1);
    public static final Field R = new Field("sensor_type", 1);
    public static final Field S = new Field("timestamps", 5);
    public static final Field T = new Field("sensor_values", 6);
    public static final Field U = new Field("intensity", 2);
    public static final Field V = new Field("activity_confidence", 4);
    public static final Field W = new Field("probability", 2);
    public static final Field X = new Field("google.android.fitness.SleepAttributes", 7);
    public static final Field Y = new Field("google.android.fitness.SleepDisorderedBreathingFeatures", 7);
    public static final Field Z = new Field("google.android.fitness.SleepSchedule", 7);
    public static final Field aa = new Field("google.android.fitness.SleepSoundscape", 7);

    @Deprecated
    public static final Field ab = new Field("circumference", 2);
    public static final Field ac = new Field("google.android.fitness.PacedWalkingAttributes", 7);
    public static final Field ad = new Field("zone_id", 3);
    public static final Field ae = new Field("met", 2);
    public static final Field af = new Field("internal_device_temperature", 2);
    public static final Field ag = new Field("skin_temperature", 2);
    public static final Field ah = new Field("custom_heart_rate_zone_status", 1);
    public static final Field ai = new Field("min_int", 1);
    public static final Field aj = new Field("max_int", 1);
    public static final Field ak = b("lightly_active_duration");
    public static final Field al = b("moderately_active_duration");
    public static final Field am = b("very_active_duration");
    public static final Field an = new Field("google.android.fitness.SedentaryTime", 7);
    public static final Field ao = new Field("google.android.fitness.LivePace", 7);
    public static final Field ap = new Field("google.android.fitness.MomentaryStressAlgorithm", 7);
    public static final Field aq = new Field("magnet_presence", 1);
    public static final Field ar = new Field("google.android.fitness.MomentaryStressWindows", 7);
    public static final Field as = new Field("google.android.fitness.ExerciseDetectionThresholds", 7);
    public static final Field at = new Field("google.android.fitness.RecoveryHeartRate", 7);
    public static final Field au = new Field("google.android.fitness.HeartRateVariability", 7);
    public static final Field av = new Field("google.android.fitness.HeartRateVariabilitySummary", 7);
    public static final Field aw = new Field("google.android.fitness.ContinuousEDA", 7);
    public static final Field ax = new Field("google.android.fitness.TimeInSleepStages", 7);
    public static final Field ay = new Field("google.android.fitness.Grok", 7);
    public static final Field az = new Field("google.android.fitness.WakeMagnitude", 7);
    public static final Field aA = new Field("google.android.fitness.FatBurnMinutes", 1);
    public static final Field aB = new Field("google.android.fitness.CardioMinutes", 1);
    public static final Field aC = new Field("google.android.fitness.PeakHeartRateMinutes", 1);
    public static final Field aD = new Field("google.android.fitness.ActiveZoneMinutes", 1);
    public static final Field aE = new Field("google.android.fitness.SleepCoefficient", 7);
    public static final Field aF = new Field("google.android.fitness.RunVO2Max", 7);
    public static final Field aG = new Field("device_location_type", 1);
    public static final Field aH = new Field("device_id", 3);
    public static final Field aI = new Field("google.android.fitness.DemographicVO2Max", 7);
    public static final Field aJ = new Field("google.android.fitness.SleepSetting", 7);
    public static final Field aK = new Field("google.android.fitness.ValuesInHeartRateZones", 7);
    public static final Field aL = new Field("google.android.fitness.HeartHistogram", 7);
    public static final Field aM = new Field("google.android.fitness.StressScore", 7);
    public static final Field aN = new Field("google.android.fitness.RespiratoryRateSummary", 7);
    public static final Field aO = new Field("google.android.fitness.DailySkinSleepTemperatureDerivations", 7);
    public static final Field aP = new Field("google.android.fitness.SwimLengthsData", 7);
    public static final Field aQ = new Field("google.android.fitness.DailySleep", 7);
    public static final Field aR = new Field("google.android.fitness.DailyInternalDeviceTemperatureSleepTemperatureDerivations", 7);

    public Field(String str, int i2) {
        this(str, i2, null);
    }

    public static Field a(String str) {
        return new Field(str, 2, true);
    }

    public static Field b(String str) {
        return new Field(str, 1, true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return false;
        }
        Field field = (Field) obj;
        return this.aS.equals(field.aS) && this.aT == field.aT;
    }

    public final int hashCode() {
        return this.aS.hashCode();
    }

    public final String toString() {
        return String.format("%s(%s)", this.aS, this.aT == 1 ? "i" : "f");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.aS;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.aT);
        atzr.z(parcel, 3, this.aU);
        atzr.c(parcel, a2);
    }

    public Field(String str, int i2, Boolean bool) {
        atzb.s(str);
        this.aS = str;
        this.aT = i2;
        this.aU = bool;
    }
}
