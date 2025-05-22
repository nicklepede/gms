package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cwon;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AvatarReference extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cwon();
    public final int a;

    @Deprecated
    public final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final Long g;
    final Long h;

    @Deprecated
    public AvatarReference(String str) {
        atzb.l(true);
        this.a = 1;
        this.b = str;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AvatarReference avatarReference = (AvatarReference) obj;
            if (this.a == avatarReference.a && atyq.b(this.b, avatarReference.b) && atyq.b(this.c, avatarReference.c) && atyq.b(this.d, avatarReference.d) && atyq.b(this.e, avatarReference.e) && atyq.b(this.f, avatarReference.f) && atyq.b(this.g, avatarReference.g) && atyq.b(this.h, avatarReference.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("source", Integer.valueOf(this.a), arrayList);
        atyp.b("location", this.b, arrayList);
        atyp.b("url", this.c, arrayList);
        atyp.b("email", this.d, arrayList);
        atyp.b("account", this.e, arrayList);
        atyp.b("focusId", this.f, arrayList);
        atyp.b("contactId", this.g, arrayList);
        atyp.b("rawContactId", this.h, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.I(parcel, 7, this.g);
        atzr.I(parcel, 8, this.h);
        atzr.c(parcel, a);
    }

    public AvatarReference(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        atzb.l(i != 0);
        this.a = i;
        this.b = true == TextUtils.isEmpty(str) ? null : str;
        this.c = true == TextUtils.isEmpty(str2) ? null : str2;
        this.d = true == TextUtils.isEmpty(str3) ? null : str3;
        this.e = true == TextUtils.isEmpty(str4) ? null : str4;
        this.f = true == TextUtils.isEmpty(str5) ? null : str5;
        this.g = l;
        this.h = l2;
    }
}
