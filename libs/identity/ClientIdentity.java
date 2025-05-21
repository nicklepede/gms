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
import defpackage.aqto;
import defpackage.arxc;
import defpackage.bhec;
import defpackage.bwpq;
import defpackage.bwpr;
import defpackage.bwps;
import defpackage.bwpt;
import defpackage.bwpu;
import defpackage.bwpz;
import defpackage.eitd;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.fvbo;
import defpackage.fvfj;
import defpackage.iqh;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bwpt();
    public static final int a = Process.myUid();
    public static final int b = Process.myPid();
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public Integer h;
    public final List i;
    public bwpu j;
    public final ClientIdentity k;

    public /* synthetic */ ClientIdentity(int i, int i2, String str, String str2, Integer num, List list, bwpu bwpuVar, ClientIdentity clientIdentity) {
        this(i, i2, str, str2, null, num, list, bwpuVar, clientIdentity);
    }

    public static final ClientIdentity d(Context context) {
        fvbo.f(context, "context");
        bwpu bwpuVar = bwpu.a;
        fvbo.f(context, "context");
        fvbo.f(bwpuVar, "clientType");
        int i = a;
        int i2 = b;
        String packageName = context.getPackageName();
        fvbo.e(packageName, "getPackageName(...)");
        return new ClientIdentity(i, i2, packageName, Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null, Integer.valueOf(aqto.b), null, bwpuVar, null);
    }

    public static final ClientIdentity e(bhec bhecVar, GetServiceRequest getServiceRequest, int i, int i2) {
        fvbo.f(bhecVar, "clientType");
        fvbo.f(getServiceRequest, "request");
        return bwpq.b(bhecVar, getServiceRequest, i, i2);
    }

    public static /* synthetic */ ClientIdentity t(ClientIdentity clientIdentity, String str, String str2, bwpz bwpzVar, int i) {
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
                fvbo.f(a2, "validatedUserHandle");
                bwpzVar = new bwpz(clientIdentity3, null, true, a2);
            } else {
                bwpzVar = null;
            }
        }
        fvbo.f(list, "clientFeatures");
        if (bwpzVar == null && clientIdentity.k == null && fvbo.n(str3, clientIdentity.f) && fvbo.n(str4, clientIdentity.g) && fvbo.n(list, clientIdentity.i)) {
            return clientIdentity;
        }
        int i2 = clientIdentity.c;
        int i3 = clientIdentity.d;
        String str5 = clientIdentity.e;
        Integer num = clientIdentity.h;
        bwpu bwpuVar = clientIdentity.j;
        if (bwpzVar != null) {
            UserHandle a3 = iqh.a(i2);
            fvbo.e(a3, "getUserHandleForUid(...)");
            clientIdentity2 = bwpzVar.a(a3);
        }
        return new ClientIdentity(i2, i3, str5, str3, str4, num, list, bwpuVar, clientIdentity2);
    }

    public static final ClientIdentity u(String str, int i, String str2) {
        fvbo.f(str, "packageName");
        return bwpq.c(str, i, -1, str2, null, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
    }

    public final UserHandle a() {
        UserHandle a2 = iqh.a(this.c);
        fvbo.e(a2, "getUserHandleForUid(...)");
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
            if (this.c == clientIdentity.c && fvbo.n(this.e, clientIdentity.e) && fvbo.n(this.f, clientIdentity.f) && fvbo.n(this.g, clientIdentity.g) && fvbo.n(this.k, clientIdentity.k) && fvbo.n(this.i, clientIdentity.i)) {
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
        fvbo.f(context, "context");
        return clientIdentity != null ? t(clientIdentity, null, str, h(context), 5) : t(this, null, str, null, 13);
    }

    public final bwpz h(Context context) {
        fvbo.f(context, "context");
        fvbo.f(context, "context");
        return new bwpz(this, context, false, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.e, this.f, this.g, this.k});
    }

    public final void i(Context context, String... strArr) {
        fvbo.f(context, "context");
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, 2);
        fvbo.f(context, "context");
        fvbo.f(strArr2, "permissions");
        for (String str : strArr2) {
            if (context.checkPermission(str, this.d, this.c) == 0) {
                return;
            }
        }
        int i = this.c;
        String arrays = Arrays.toString(strArr);
        fvbo.e(arrays, "toString(...)");
        throw new SecurityException("uid " + i + " does not have any of " + arrays + ".");
    }

    public final void j(Context context) {
        fvbo.f(context, "context");
        if (!((Boolean) new bwpr(this).a(context)).booleanValue()) {
            throw new SecurityException(a.f(this, "rejected identity ", " with insufficient privileges"));
        }
    }

    public final void k(Context context, String... strArr) {
        fvbo.f(context, "context");
        for (String str : strArr) {
            context.enforcePermission(str, this.d, this.c, null);
        }
    }

    public final void l(Context context) {
        fvbo.f(context, "context");
        if (!((Boolean) new bwps(this).a(context)).booleanValue()) {
            throw new SecurityException(a.f(this, "rejected identity ", " with insufficient privileges"));
        }
    }

    public final boolean m(Context context, String... strArr) {
        fvbo.f(context, "context");
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
        return fvbo.n(a(), Process.myUserHandle());
    }

    public final boolean r() {
        return this.c == 1000;
    }

    public final boolean s(Feature feature) {
        String str = feature.a;
        fvbo.e(str, "getName(...)");
        long a2 = feature.a();
        fvbo.f(str, "name");
        List<Feature> list = this.i;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Feature feature2 : list) {
            if (fvbo.n(feature2.a, str) && feature2.a() >= a2) {
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
            if (fvfj.Q(str2, str)) {
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
        fvbo.f(parcel, "dest");
        int i2 = this.c;
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 3, this.e, false);
        arxc.v(parcel, 4, this.f, false);
        arxc.v(parcel, 6, this.g, false);
        arxc.t(parcel, 7, this.k, i, false);
        arxc.y(parcel, 8, this.i, false);
        arxc.c(parcel, a2);
    }

    public ClientIdentity(int i, int i2, String str, String str2, String str3, Integer num, List list, bwpu bwpuVar, ClientIdentity clientIdentity) {
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
                int i3 = eitj.d;
                list = ejcb.a;
                fvbo.e(list, "of(...)");
            }
        }
        this.i = eitd.a(list);
        this.j = bwpuVar;
        this.k = clientIdentity;
    }
}
