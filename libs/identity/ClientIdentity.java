package com.google.android.gms.libs.identity;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserHandle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
import defpackage.aswd;
import defpackage.atzr;
import defpackage.bjis;
import defpackage.byyd;
import defpackage.byye;
import defpackage.byyf;
import defpackage.byyg;
import defpackage.byyh;
import defpackage.byym;
import defpackage.elgi;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.fxxm;
import defpackage.fybh;
import defpackage.irx;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new byyg();
    public static final int a = Process.myUid();
    public static final int b = Process.myPid();
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public Integer h;
    public final List i;
    public byyh j;
    public final ClientIdentity k;

    public /* synthetic */ ClientIdentity(int i, int i2, String str, String str2, Integer num, List list, byyh byyhVar, ClientIdentity clientIdentity) {
        this(i, i2, str, str2, null, num, list, byyhVar, clientIdentity);
    }

    public static final ClientIdentity d(Context context) {
        fxxm.f(context, "context");
        byyh byyhVar = byyh.a;
        fxxm.f(context, "context");
        fxxm.f(byyhVar, "clientType");
        int i = a;
        int i2 = b;
        String packageName = context.getPackageName();
        fxxm.e(packageName, "getPackageName(...)");
        return new ClientIdentity(i, i2, packageName, Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null, Integer.valueOf(aswd.b), null, byyhVar, null);
    }

    public static final ClientIdentity e(bjis bjisVar, GetServiceRequest getServiceRequest, int i, int i2) {
        fxxm.f(bjisVar, "clientType");
        fxxm.f(getServiceRequest, "request");
        return byyd.b(bjisVar, getServiceRequest, i, i2);
    }

    public static /* synthetic */ ClientIdentity t(ClientIdentity clientIdentity, String str, String str2, byym byymVar, int i) {
        if ((i & 1) != 0) {
            str = clientIdentity.f;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = clientIdentity.g;
        }
        String str4 = str2;
        ClientIdentity clientIdentity2 = null;
        List list = (i & 4) != 0 ? clientIdentity.i : null;
        if ((i & 8) != 0) {
            ClientIdentity clientIdentity3 = clientIdentity.k;
            if (clientIdentity3 != null) {
                UserHandle a2 = clientIdentity3.a();
                fxxm.f(a2, "validatedUserHandle");
                byymVar = new byym(clientIdentity3, null, true, a2);
            } else {
                byymVar = null;
            }
        }
        fxxm.f(list, "clientFeatures");
        if (byymVar == null && clientIdentity.k == null && fxxm.n(str3, clientIdentity.f) && fxxm.n(str4, clientIdentity.g) && fxxm.n(list, clientIdentity.i)) {
            return clientIdentity;
        }
        int i2 = clientIdentity.c;
        int i3 = clientIdentity.d;
        String str5 = clientIdentity.e;
        Integer num = clientIdentity.h;
        byyh byyhVar = clientIdentity.j;
        if (byymVar != null) {
            UserHandle a3 = irx.a(i2);
            fxxm.e(a3, "getUserHandleForUid(...)");
            clientIdentity2 = byymVar.a(a3);
        }
        return new ClientIdentity(i2, i3, str5, str3, str4, num, list, byyhVar, clientIdentity2);
    }

    public static final ClientIdentity u(String str, int i, String str2) {
        fxxm.f(str, "packageName");
        return byyd.c(str, i, -1, str2, null, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
    }

    public final UserHandle a() {
        UserHandle a2 = irx.a(this.c);
        fxxm.e(a2, "getUserHandleForUid(...)");
        return a2;
    }

    public final ClientIdentity b(String str, String str2) {
        return t(this, str, str2, null, 12);
    }

    public final ClientIdentity c() {
        return (this.g == null && this.i.isEmpty() && this.k == null) ? this : new ClientIdentity(this.c, this.d, this.e, this.f, null, this.h, null, this.j, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (this.c == clientIdentity.c && fxxm.n(this.e, clientIdentity.e) && fxxm.n(this.f, clientIdentity.f) && fxxm.n(this.g, clientIdentity.g) && fxxm.n(this.k, clientIdentity.k) && fxxm.n(this.i, clientIdentity.i)) {
                return true;
            }
        }
        return false;
    }

    public final ClientIdentity f() {
        ClientIdentity clientIdentity = this.k;
        return clientIdentity == null ? this : clientIdentity;
    }

    public final ClientIdentity g(Context context, ClientIdentity clientIdentity, String str) {
        fxxm.f(context, "context");
        return clientIdentity != null ? t(clientIdentity, null, str, h(context), 5) : t(this, null, str, null, 13);
    }

    public final byym h(Context context) {
        fxxm.f(context, "context");
        fxxm.f(context, "context");
        return new byym(this, context, false, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.e, this.f, this.g, this.k});
    }

    public final void i(Context context, String... strArr) {
        fxxm.f(context, "context");
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, 2);
        fxxm.f(context, "context");
        fxxm.f(strArr2, "permissions");
        for (String str : strArr2) {
            if (context.checkPermission(str, this.d, this.c) == 0) {
                return;
            }
        }
        int i = this.c;
        String arrays = Arrays.toString(strArr);
        fxxm.e(arrays, "toString(...)");
        throw new SecurityException("uid " + i + " does not have any of " + arrays + ".");
    }

    public final void j(Context context) {
        fxxm.f(context, "context");
        if (!((Boolean) new byye(this).a(context)).booleanValue()) {
            throw new SecurityException(a.f(this, "rejected identity ", " with insufficient privileges"));
        }
    }

    public final void k(Context context, String... strArr) {
        fxxm.f(context, "context");
        for (String str : strArr) {
            context.enforcePermission(str, this.d, this.c, null);
        }
    }

    public final void l(Context context) {
        fxxm.f(context, "context");
        if (!((Boolean) new byyf(this).a(context)).booleanValue()) {
            throw new SecurityException(a.f(this, "rejected identity ", " with insufficient privileges"));
        }
    }

    public final boolean m(Context context, String... strArr) {
        fxxm.f(context, "context");
        return context.checkPermission(strArr[0], this.d, this.c) == 0;
    }

    public final boolean n() {
        return this.k != null;
    }

    public final boolean o() {
        return this.d == b;
    }

    public final boolean p() {
        return this.c == a;
    }

    public final boolean q() {
        return fxxm.n(a(), Process.myUserHandle());
    }

    public final boolean r() {
        return this.c == 1000;
    }

    public final boolean s(Feature feature) {
        String str = feature.a;
        fxxm.e(str, "getName(...)");
        long a2 = feature.a();
        fxxm.f(str, "name");
        List<Feature> list = this.i;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Feature feature2 : list) {
            if (fxxm.n(feature2.a, str) && feature2.a() >= a2) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.e;
        int length = str.length() + 18;
        String str2 = this.f;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.c);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (fybh.Q(str2, str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.g;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        int i2 = this.c;
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 3, this.e, false);
        atzr.v(parcel, 4, this.f, false);
        atzr.v(parcel, 6, this.g, false);
        atzr.t(parcel, 7, this.k, i, false);
        atzr.y(parcel, 8, this.i, false);
        atzr.c(parcel, a2);
    }

    public ClientIdentity(int i, int i2, String str, String str2, String str3, Integer num, List list, byyh byyhVar, ClientIdentity clientIdentity) {
        if (clientIdentity != null && clientIdentity.n()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = str3 == null ? clientIdentity != null ? clientIdentity.g : null : str3;
        this.h = num == null ? clientIdentity != null ? clientIdentity.h : null : num;
        if (list == null) {
            list = clientIdentity != null ? clientIdentity.i : null;
            if (list == null) {
                int i3 = elgo.d;
                list = elpg.a;
                fxxm.e(list, "of(...)");
            }
        }
        this.i = elgi.a(list);
        this.j = byyhVar;
        this.k = clientIdentity;
    }
}
