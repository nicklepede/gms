package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bihv;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DataType extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final DataType A;
    public static final DataType B;
    public static final DataType C;
    public static final Parcelable.Creator CREATOR = new bihv();
    public static final DataType D;
    public static final DataType E;
    public static final DataType F;
    public static final DataType G;
    public static final DataType H;
    public static final DataType I;
    public static final DataType J;
    public static final DataType K;
    public static final DataType L;
    public static final DataType M;
    public static final DataType N;
    public static final DataType O;
    public static final DataType P;
    public static final DataType Q;
    public static final DataType R;
    public static final DataType S;
    public static final DataType T;
    public static final DataType U;
    public static final DataType V;
    public static final DataType W;
    public static final DataType X;
    public static final DataType Y;

    @Deprecated
    public static final DataType Z;
    public static final DataType a;

    @Deprecated
    public static final DataType aA;

    @Deprecated
    public static final DataType aB;

    @Deprecated
    public static final DataType aC;

    @Deprecated
    public static final DataType aD;

    @Deprecated
    public static final DataType aE;

    @Deprecated
    public static final DataType aF;

    @Deprecated
    public static final DataType aG;

    @Deprecated
    public static final DataType aH;

    @Deprecated
    public static final DataType aa;
    public static final DataType ab;
    public static final DataType ac;
    public static final DataType ad;

    @Deprecated
    public static final DataType ae;

    @Deprecated
    public static final DataType af;

    @Deprecated
    public static final DataType ag;
    public static final DataType ah;

    @Deprecated
    public static final DataType ai;

    @Deprecated
    public static final DataType aj;

    @Deprecated
    public static final DataType ak;

    @Deprecated
    public static final DataType al;

    @Deprecated
    public static final DataType am;

    @Deprecated
    public static final DataType an;

    @Deprecated
    public static final DataType ao;

    @Deprecated
    public static final DataType ap;

    @Deprecated
    public static final DataType aq;

    @Deprecated
    public static final DataType ar;

    @Deprecated
    public static final DataType as;

    @Deprecated
    public static final DataType at;
    public static final DataType au;

    @Deprecated
    public static final DataType av;

    @Deprecated
    public static final DataType aw;

    @Deprecated
    public static final DataType ax;

    @Deprecated
    public static final DataType ay;

    @Deprecated
    public static final DataType az;
    public static final DataType b;
    public static final DataType c;
    public static final DataType d;
    public static final DataType e;

    @Deprecated
    public static final DataType f;
    public static final DataType g;

    @Deprecated
    public static final DataType h;
    public static final DataType i;
    public static final DataType j;
    public static final DataType k;
    public static final DataType l;
    public static final DataType m;
    public static final DataType n;
    public static final DataType o;

    @Deprecated
    public static final DataType p;
    public static final DataType q;
    public static final DataType r;
    public static final DataType s;
    public static final DataType t;
    public static final DataType u;
    public static final DataType v;
    public static final DataType w;
    public static final DataType x;
    public static final DataType y;
    public static final DataType z;
    public final String aI;
    public final List aJ;
    public final String aK;
    public final String aL;

    static {
        DataType dataType = new DataType("com.google.step_count.delta", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.d);
        a = dataType;
        b = new DataType("com.google.step_count.cumulative", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.d);
        c = new DataType("com.google.step_count.cadence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.u);
        d = new DataType("com.google.internal.goal", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.v);
        e = new DataType("com.google.activity.segment", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.a);
        f = new DataType("com.google.internal.sleep_disordered_breathing_features", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.Y);
        g = new DataType("com.google.sleep.segment", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.b);
        h = new DataType("com.google.internal.sleep_soundscape", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.aa);
        DataType dataType2 = new DataType("com.google.calories.expended", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.y);
        i = dataType2;
        j = new DataType("com.google.calories.bmr", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.y);
        k = new DataType("com.google.power.sample", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.z);
        l = new DataType("com.google.sensor.events", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.R, Field.S, Field.T);
        m = new DataType("com.google.heart_rate.bpm", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.j);
        n = new DataType("com.google.respiratory_rate", "https://www.googleapis.com/auth/fitness.respiratory_rate.read", "https://www.googleapis.com/auth/fitness.respiratory_rate.write", Field.k);
        o = new DataType("com.google.location.sample", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.l, Field.m, Field.n, Field.o);
        p = new DataType("com.google.location.track", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.l, Field.m, Field.n, Field.o);
        DataType dataType3 = new DataType("com.google.distance.delta", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.p);
        q = dataType3;
        r = new DataType("com.google.speed", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.t);
        s = new DataType("com.google.cycling.wheel_revolution.cumulative", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.x);
        t = new DataType("com.google.cycling.wheel_revolution.rpm", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.u);
        u = new DataType("com.google.cycling.pedaling.cumulative", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.x);
        v = new DataType("com.google.cycling.pedaling.cadence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.u);
        w = new DataType("com.google.height", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.q);
        x = new DataType("com.google.weight", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.r);
        y = new DataType("com.google.body.fat.percentage", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.s);
        z = new DataType("com.google.nutrition", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", Field.D, Field.B, Field.C);
        DataType dataType4 = new DataType("com.google.hydration", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", Field.A);
        A = dataType4;
        B = new DataType("com.google.activity.exercise", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.E, Field.F, Field.g, Field.H, Field.G);
        DataType dataType5 = new DataType("com.google.active_minutes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f);
        C = dataType5;
        D = dataType5;
        E = new DataType("com.google.device_on_body", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.W);
        F = new DataType("com.google.activity.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.a, Field.f, Field.I);
        G = new DataType("com.google.calories.bmr.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.J, Field.K, Field.L);
        H = dataType;
        I = dataType3;
        J = dataType2;
        K = new DataType("com.google.heart_minutes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.U);
        L = new DataType("com.google.heart_minutes.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.U, Field.f);
        M = new DataType("com.google.heart_rate.summary", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.J, Field.K, Field.L);
        N = new DataType("com.google.location.bounding_box", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.M, Field.N, Field.O, Field.P);
        O = new DataType("com.google.power.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.J, Field.K, Field.L);
        P = new DataType("com.google.speed.summary", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.J, Field.K, Field.L);
        Q = new DataType("com.google.body.fat.percentage.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.J, Field.K, Field.L);
        R = new DataType("com.google.weight.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.J, Field.K, Field.L);
        S = new DataType("com.google.height.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.J, Field.K, Field.L);
        T = new DataType("com.google.nutrition.summary", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", Field.D, Field.B);
        U = dataType4;
        V = new DataType("com.google.activity.samples", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.V);
        W = new DataType("com.google.internal.sleep_attributes", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.X);
        X = new DataType("com.google.internal.sleep_schedule", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.Z);
        Y = new DataType("com.google.internal.paced_walking_attributes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.ac);
        Z = new DataType("com.google.time_zone_change", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.ad);
        aa = new DataType("com.google.internal.met", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.ae);
        ab = new DataType("com.google.internal.internal_device_temperature", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", Field.af);
        ac = new DataType("com.google.internal.skin_temperature", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", Field.ag);
        ad = new DataType("com.google.internal.custom_heart_rate_zone", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.ah, Field.ai, Field.aj);
        ae = new DataType("com.google.internal.active_minutes_combined", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.ak, Field.al, Field.am);
        af = new DataType("com.google.internal.sedentary_time", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.an);
        ag = new DataType("com.google.internal.live_pace", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.ao);
        ah = new DataType("com.google.internal.custom_max_heart_rate", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.aj);
        ai = new DataType("com.google.internal.momentary_stress_algorithm", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.ap);
        aj = new DataType("com.google.internal.magnetic_field_presence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.aq);
        ak = new DataType("com.google.internal.momentary_stress_windows", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.ar);
        al = new DataType("com.google.internal.exercise_detection_thresholds", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.as);
        am = new DataType("com.google.internal.recovery_heart_rate", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.at);
        an = new DataType("com.google.internal.heart_rate_variability", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.au);
        ao = new DataType("com.google.internal.heart_rate_variability_summary", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.av);
        ap = new DataType("com.google.internal.continuous_eda", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.aw);
        aq = new DataType("com.google.internal.altitude_sample", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.o);
        ar = new DataType("com.google.internal.time_in_sleep_stages", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.ax);
        as = new DataType("com.google.internal.grok_data", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.ay);
        at = new DataType("com.google.internal.wake_magnitude", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.az);
        au = new DataType("com.google.internal.active_zone_minutes_summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.aA, Field.aB, Field.aC, Field.aD);
        av = new DataType("com.google.internal.sleep_coefficient", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.aE);
        aw = new DataType("com.google.internal.run_vo2_max", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.aF);
        ax = new DataType("com.google.internal.demographic_vo2_max", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.aI);
        ay = new DataType("com.google.internal.sleep_setting", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.aJ);
        az = new DataType("com.google.internal.values_in_heart_rate_zones", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.aK);
        aA = new DataType("com.google.internal.heart_histogram", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.aL);
        aB = new DataType("com.google.internal.respiratory_rate_summary", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.aN);
        aC = new DataType("com.google.internal.stress_score", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.aM);
        aD = new DataType("com.google.internal.device_location", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.l, Field.m, Field.n, Field.aG, Field.aH);
        aE = new DataType("com.google.internal.daily_skin_sleep_temperature_derivations", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", Field.aO);
        aF = new DataType("com.google.internal.swim_lengths_data", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.aP);
        aG = new DataType("com.google.internal.daily_sleep", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.aQ);
        aH = new DataType("com.google.internal.daily_internal_device_temperature_sleep_temperature_derivations", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", Field.aR);
    }

    public DataType(String str, String str2, String str3, Field... fieldArr) {
        this.aI = str;
        this.aJ = DesugarCollections.unmodifiableList(Arrays.asList(fieldArr));
        this.aK = str2;
        this.aL = str3;
    }

    public final String a() {
        String str = this.aI;
        return str.startsWith("com.google.") ? str.substring(11) : str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataType)) {
            return false;
        }
        DataType dataType = (DataType) obj;
        return this.aI.equals(dataType.aI) && this.aJ.equals(dataType.aJ);
    }

    public final int hashCode() {
        return this.aI.hashCode();
    }

    public final String toString() {
        return String.format("DataType{%s%s}", this.aI, this.aJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.aI;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.y(parcel, 2, this.aJ, false);
        atzr.v(parcel, 3, this.aK, false);
        atzr.v(parcel, 4, this.aL, false);
        atzr.c(parcel, a2);
    }

    public DataType(String str, List list, String str2, String str3) {
        this.aI = str;
        this.aJ = DesugarCollections.unmodifiableList(list);
        this.aK = str2;
        this.aL = str3;
    }
}
