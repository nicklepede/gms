package com.google.android.gms.thunderbird.state;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dijo;
import defpackage.dijp;
import defpackage.diml;
import defpackage.ekus;
import defpackage.ekvi;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.fvik;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class DeviceState extends AbstractSafeParcelable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;

    @Deprecated
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final ConnectionState q;
    private static final String[] r = {"", "00", "0", "", ""};
    public static final Parcelable.Creator CREATOR = new dijp();

    public DeviceState(int i, int i2, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, List list, int i3, int i4, int i5, ConnectionState connectionState) {
        elgo i6;
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        if (list == null) {
            int i7 = elgo.d;
            i6 = elpg.a;
        } else {
            i6 = elgo.i(list);
        }
        this.m = i6;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = connectionState;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0ab2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x096e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07c3 A[Catch: SecurityException -> 0x07e5, TRY_LEAVE, TryCatch #2 {SecurityException -> 0x07e5, blocks: (B:67:0x07ad, B:190:0x07c3), top: B:66:0x07ad }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x073e A[Catch: SecurityException -> 0x0812, TRY_LEAVE, TryCatch #44 {SecurityException -> 0x0812, blocks: (B:227:0x071a, B:44:0x0729, B:46:0x072f, B:216:0x073e), top: B:226:0x071a }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0708 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x053c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x054f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0410 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x072f A[Catch: SecurityException -> 0x0812, TryCatch #44 {SecurityException -> 0x0812, blocks: (B:227:0x071a, B:44:0x0729, B:46:0x072f, B:216:0x073e), top: B:226:0x071a }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x074b A[Catch: SecurityException -> 0x07fe, TryCatch #43 {SecurityException -> 0x07fe, blocks: (B:48:0x0745, B:50:0x074b, B:52:0x0755), top: B:47:0x0745 }] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0a9f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.elgo c(android.content.Context r46) {
        /*
            Method dump skipped, instructions count: 2779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.thunderbird.state.DeviceState.c(android.content.Context):elgo");
    }

    public static String d(String str) {
        int i;
        if (str != null) {
            if (str.length() < 5 || str.length() > 6 || str.startsWith("000")) {
                return null;
            }
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            while (i < length) {
                char c = charArray[i];
                i = (c >= '0' && c <= '9') ? i + 1 : 0;
                return null;
            }
        }
        return str;
    }

    public static String i(int i) {
        if (i < 0 || i > 999) {
            return null;
        }
        String num = Integer.toString(i);
        String concat = String.valueOf(r[num.length()]).concat(String.valueOf(num));
        if (concat.length() != 3 || "000".equals(concat)) {
            return null;
        }
        for (char c : concat.toCharArray()) {
            if (c < '0' || c > '9') {
                return null;
            }
        }
        return concat;
    }

    public static String j(int i) {
        if (i >= 0 && i <= 999) {
            String num = Integer.toString(i);
            String concat = String.valueOf(r[num.length() + 1]).concat(String.valueOf(num));
            if (concat.length() < 2 || concat.length() > 3) {
                return null;
            }
            for (char c : concat.toCharArray()) {
                if (c < '0' || c > '9') {
                    return null;
                }
            }
            return concat;
        }
        return null;
    }

    public final DeviceState a(TelephoneNumber telephoneNumber) {
        ekvi i = ekvi.i(this.q);
        elgj elgjVar = new elgj();
        elgjVar.k(this.m);
        elgjVar.i(telephoneNumber);
        return dijo.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, elgjVar.g(), this.n, this.o, this.p, i);
    }

    public final ekvi b() {
        return ekvi.i(this.q);
    }

    public final String e(Context context) {
        if (!fvik.H()) {
            return this.f;
        }
        ekvi b = fvik.t() ? new diml(context, this.m, this.k, this.l).b() : new diml(context, this.m, this.j).b();
        if (b.h()) {
            return ((TelephoneNumber) b.c()).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceState deviceState = (DeviceState) obj;
            if (this.a == deviceState.a && this.b == deviceState.b && ekus.a(this.c, deviceState.c) && ekus.a(this.d, deviceState.d) && ekus.a(this.e, deviceState.e) && ekus.a(this.f, deviceState.f) && ekus.a(this.h, deviceState.h) && ekus.a(this.i, deviceState.i) && ekus.a(this.j, deviceState.j) && ekus.a(this.k, deviceState.k) && ekus.a(this.l, deviceState.l) && ekus.a(this.m, deviceState.m) && this.n == deviceState.n && this.o == deviceState.o && this.p == deviceState.p && ekus.a(this.q, deviceState.q)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        String str = this.i;
        if (str == null) {
            return null;
        }
        return str.substring(0, 3);
    }

    public final String g() {
        String str = this.i;
        if (str == null) {
            return null;
        }
        return str.substring(3);
    }

    public final String h() {
        int i = this.a;
        return i == Integer.MAX_VALUE ? "DEFAULT" : Integer.toString(i);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        if (fvik.a.lK().ay()) {
            return h() + "{HomeMCCMNC=" + this.h + ", NetworkMCCMNC=" + this.i + "}";
        }
        String h = h();
        String str = this.c;
        String str2 = this.d;
        int i = this.b;
        String str3 = this.f;
        String str4 = this.h;
        String str5 = this.i;
        String str6 = this.j;
        String str7 = this.k;
        String str8 = this.l;
        List list = this.m;
        int i2 = this.n;
        int i3 = this.o;
        int i4 = this.p;
        ConnectionState connectionState = this.q;
        return h + "{IMEI=" + str + ", IMSI=" + str2 + ", SimSlotIndex=" + i + ", PhoneNumber=" + str3 + ", HomeMCCMNC=" + str4 + ", NetworkMCCMNC=" + str5 + ", CountryIso=" + str6 + ", SimCountryIso=" + str7 + ", NetworkCountryIso=" + str8 + ", PhoneNumbers=" + String.valueOf(list) + ", InvocationBatteryPercentage=" + i2 + ", NetworkType=" + i3 + ", InvocationNetworkType=" + i4 + ", ConnectionState=" + String.valueOf(connectionState) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.c;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.d, false);
        atzr.v(parcel, 3, this.e, false);
        atzr.v(parcel, 4, this.f, false);
        atzr.v(parcel, 6, this.h, false);
        atzr.v(parcel, 7, this.i, false);
        atzr.o(parcel, 9, this.a);
        atzr.e(parcel, 10, this.g);
        atzr.v(parcel, 11, this.j, false);
        atzr.y(parcel, 12, this.m, false);
        atzr.o(parcel, 13, this.b);
        atzr.o(parcel, 14, this.n);
        atzr.v(parcel, 15, this.k, false);
        atzr.v(parcel, 16, this.l, false);
        atzr.o(parcel, 17, this.o);
        atzr.o(parcel, 18, this.p);
        atzr.t(parcel, 19, this.q, i, false);
        atzr.c(parcel, a);
    }
}
