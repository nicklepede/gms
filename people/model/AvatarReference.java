package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cufg;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AvatarReference extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cufg();
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
        arwm.l(true);
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
            if (this.a == avatarReference.a && arwb.b(this.b, avatarReference.b) && arwb.b(this.c, avatarReference.c) && arwb.b(this.d, avatarReference.d) && arwb.b(this.e, avatarReference.e) && arwb.b(this.f, avatarReference.f) && arwb.b(this.g, avatarReference.g) && arwb.b(this.h, avatarReference.h)) {
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
        arwa.b("source", Integer.valueOf(this.a), arrayList);
        arwa.b("location", this.b, arrayList);
        arwa.b("url", this.c, arrayList);
        arwa.b("email", this.d, arrayList);
        arwa.b("account", this.e, arrayList);
        arwa.b("focusId", this.f, arrayList);
        arwa.b("contactId", this.g, arrayList);
        arwa.b("rawContactId", this.h, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.I(parcel, 7, this.g);
        arxc.I(parcel, 8, this.h);
        arxc.c(parcel, a);
    }

    public AvatarReference(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        arwm.l(i != 0);
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
