package com.google.android.gms.auth.authzen;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.zsn;
import defpackage.zsq;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class Permit extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zsq();
    final int a;
    public final String b;
    public final String c;
    public final String d;
    public final PermitAccess e;
    List f;
    final Map g;
    List h;
    public final Set i;

    public Permit(int i, String str, String str2, String str3, PermitAccess permitAccess, Map map, Set set) {
        this.a = i;
        arwm.q(str);
        this.b = str;
        arwm.q(str2);
        this.c = str2;
        arwm.q(str3);
        this.d = str3;
        arwm.s(permitAccess);
        this.e = permitAccess;
        this.g = new LinkedHashMap(map);
        this.i = new HashSet(set);
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.g.values()));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Permit)) {
            return false;
        }
        Permit permit = (Permit) obj;
        return TextUtils.equals(this.c, permit.c) && TextUtils.equals(this.b, permit.b) && TextUtils.equals(this.d, permit.d) && this.e.equals(permit.e) && this.i.equals(permit.i) && this.g.equals(permit.g);
    }

    public final int hashCode() {
        return ((((((((((this.b.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.i.hashCode()) * 31) + this.e.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("Permit{ mVersion=%d, mId='%s', mAccountId='%s', mType='%s',  mLicense=%s, mAllowedChannels=%s, mRequesterAccesses=%s}", Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.i, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f = new ArrayList(this.g.values());
        this.h = new ArrayList(this.i);
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.y(parcel, 7, this.f, false);
        arxc.x(parcel, 8, this.h, false);
        arxc.c(parcel, a);
    }

    public Permit(zsn zsnVar) {
        this(2, zsnVar.a, zsnVar.b, zsnVar.c, zsnVar.d, zsnVar.e, zsnVar.f);
    }
}
