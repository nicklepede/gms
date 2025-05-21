package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ckit;
import defpackage.ckjt;
import defpackage.ckkq;
import defpackage.ckkr;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class RangingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckkr();
    public final Distance a;
    public final ZoneTransition b;
    public final AngleOfArrival c;
    public final AngleOfArrival d;
    public final long e;
    public final int f;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class AngleOfArrival extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ckit();
        public final float a;
        public final float b;

        public AngleOfArrival(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final String toString() {
            return "AngleOfArrival{" + this.a + ", accuracy=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            float f = this.a;
            int a = arxc.a(parcel);
            arxc.l(parcel, 1, f);
            arxc.l(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Distance extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ckjt();
        public final float a;
        public final float b;
        public final int c;

        public Distance(float f, float f2, int i) {
            this.a = f;
            this.b = f2;
            this.c = i;
        }

        public final String toString() {
            return String.format(Locale.ENGLISH, "Distance{%.2f m, accuracy=%.2f m, confidence=%s}", Float.valueOf(this.a), Float.valueOf(this.b), Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            float f = this.a;
            int a = arxc.a(parcel);
            arxc.l(parcel, 1, f);
            arxc.l(parcel, 2, this.b);
            arxc.o(parcel, 3, this.c);
            arxc.c(parcel, a);
        }
    }

    public RangingData(Distance distance, ZoneTransition zoneTransition, AngleOfArrival angleOfArrival, AngleOfArrival angleOfArrival2, long j, int i) {
        this.a = distance;
        this.b = zoneTransition;
        this.c = angleOfArrival;
        this.d = angleOfArrival2;
        this.e = j;
        this.f = i;
    }

    public final ckkq a() {
        ckkq ckkqVar = new ckkq();
        Distance distance = this.a;
        if (distance != null) {
            ckkqVar.a = distance;
        }
        ZoneTransition zoneTransition = this.b;
        if (zoneTransition != null) {
            ckkqVar.b = zoneTransition;
        }
        AngleOfArrival angleOfArrival = this.c;
        if (angleOfArrival != null) {
            ckkqVar.c = angleOfArrival;
        }
        AngleOfArrival angleOfArrival2 = this.d;
        if (angleOfArrival2 != null) {
            ckkqVar.d = angleOfArrival2;
        }
        ckkqVar.e = this.f;
        return ckkqVar;
    }

    public final String toString() {
        AngleOfArrival angleOfArrival = this.d;
        AngleOfArrival angleOfArrival2 = this.c;
        ZoneTransition zoneTransition = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(zoneTransition);
        String valueOf3 = String.valueOf(angleOfArrival2);
        String valueOf4 = String.valueOf(angleOfArrival);
        ArrayList arrayList = new ArrayList();
        int i = this.f;
        if ((i & 1) != 0) {
            arrayList.add("BLE");
        }
        if ((i & 2) != 0) {
            arrayList.add("UWB");
        }
        if ((i & 4) != 0) {
            arrayList.add("RTT");
        }
        return "RangingData[" + valueOf + "," + valueOf2 + "," + valueOf3 + "," + valueOf4 + "," + this.e + ", source=" + TextUtils.join("|", arrayList) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Distance distance = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, distance, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.q(parcel, 5, this.e);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
