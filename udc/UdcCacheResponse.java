package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.djgk;
import defpackage.djgv;
import defpackage.djgx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UdcCacheResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djgv();
    public final List a;
    public final int[] b;
    public final boolean c;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class SettingAvailability extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new djgk();
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
            atyp.b("CanShowValue", Boolean.valueOf(this.a), arrayList);
            return atyp.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int a = atzr.a(parcel);
            atzr.e(parcel, 2, z);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class UdcSetting extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new djgx();
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
            return this.a == udcSetting.a && this.b == udcSetting.b && atyq.b(this.c, udcSetting.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            atyp.b("SettingId", Integer.valueOf(this.a), arrayList);
            atyp.b("SettingValue", Integer.valueOf(this.b), arrayList);
            atyp.b("SettingAvailability", this.c, arrayList);
            return atyp.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = atzr.a(parcel);
            atzr.o(parcel, 2, i2);
            atzr.o(parcel, 3, this.b);
            atzr.t(parcel, 4, this.c, i, false);
            atzr.c(parcel, a);
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
        atyp.b("Settings", this.a, arrayList);
        atyp.b("ConsentableSettings", Arrays.toString(this.b), arrayList);
        atyp.b("CanMostLikelyStartConsentFlow", Boolean.valueOf(this.c), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 2, list, false);
        atzr.p(parcel, 3, this.b, false);
        atzr.e(parcel, 4, this.c);
        atzr.c(parcel, a);
    }
}
