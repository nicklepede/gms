package com.google.android.gms.auth.authzen;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.absn;
import defpackage.absq;
import defpackage.atzb;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class Permit extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new absq();
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
        atzb.q(str);
        this.b = str;
        atzb.q(str2);
        this.c = str2;
        atzb.q(str3);
        this.d = str3;
        atzb.s(permitAccess);
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.y(parcel, 7, this.f, false);
        atzr.x(parcel, 8, this.h, false);
        atzr.c(parcel, a);
    }

    public Permit(absn absnVar) {
        this(2, absnVar.a, absnVar.b, absnVar.c, absnVar.d, absnVar.e, absnVar.f);
    }
}
