package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dgve;
import defpackage.dgvp;
import defpackage.dgvr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UdcCacheResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgvp();
    public final List a;
    public final int[] b;
    public final boolean c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class SettingAvailability extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dgve();
        public final boolean a;

        public SettingAvailability(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof SettingAvailability) && this.a == ((SettingAvailability) obj).a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arwa.b("CanShowValue", Boolean.valueOf(this.a), arrayList);
            return arwa.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int a = arxc.a(parcel);
            arxc.e(parcel, 2, z);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class UdcSetting extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dgvr();
        public final int a;
        public final int b;
        public final SettingAvailability c;

        public UdcSetting(int i, int i2, SettingAvailability settingAvailability) {
            this.a = i;
            this.b = i2;
            this.c = settingAvailability;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof UdcSetting)) {
                return false;
            }
            UdcSetting udcSetting = (UdcSetting) obj;
            return this.a == udcSetting.a && this.b == udcSetting.b && arwb.b(this.c, udcSetting.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arwa.b("SettingId", Integer.valueOf(this.a), arrayList);
            arwa.b("SettingValue", Integer.valueOf(this.b), arrayList);
            arwa.b("SettingAvailability", this.c, arrayList);
            return arwa.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 2, i2);
            arxc.o(parcel, 3, this.b);
            arxc.t(parcel, 4, this.c, i, false);
            arxc.c(parcel, a);
        }
    }

    public UdcCacheResponse(List list, int[] iArr, boolean z) {
        this.a = list;
        this.b = iArr;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UdcCacheResponse)) {
            return false;
        }
        UdcCacheResponse udcCacheResponse = (UdcCacheResponse) obj;
        return this.a.equals(udcCacheResponse.a) && Arrays.equals(this.b, udcCacheResponse.b) && this.c == udcCacheResponse.c;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("Settings", this.a, arrayList);
        arwa.b("ConsentableSettings", Arrays.toString(this.b), arrayList);
        arwa.b("CanMostLikelyStartConsentFlow", Boolean.valueOf(this.c), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 2, list, false);
        arxc.p(parcel, 3, this.b, false);
        arxc.e(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
