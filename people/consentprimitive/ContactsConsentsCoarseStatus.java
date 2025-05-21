package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctta;
import defpackage.eihn;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctta();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final List f;
    private final List g;

    public ContactsConsentsCoarseStatus(boolean z, boolean z2, List list, List list2, String str, boolean z3, List list3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.e = list;
        this.f = list2;
        this.d = z3;
        this.g = list3;
    }

    public final eitj a() {
        List list = this.e;
        if (list != null) {
            return eitj.i(list);
        }
        int i = eitj.d;
        return ejcb.a;
    }

    public final List b() {
        List list = this.g;
        if (list != null) {
            return eitj.i(list);
        }
        int i = eitj.d;
        return ejcb.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) obj;
        return this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && eihn.a(this.f, contactsConsentsCoarseStatus.f) && eihn.a(this.e, contactsConsentsCoarseStatus.e) && eihn.a(this.c, contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && eihn.a(this.g, contactsConsentsCoarseStatus.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.e, this.f, this.c, Boolean.valueOf(this.d), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eitj i2;
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.e(parcel, 2, this.b);
        arxc.y(parcel, 3, a(), false);
        List list = this.f;
        if (list == null) {
            int i3 = eitj.d;
            i2 = ejcb.a;
        } else {
            i2 = eitj.i(list);
        }
        arxc.y(parcel, 4, i2, false);
        arxc.v(parcel, 5, this.c, false);
        arxc.e(parcel, 6, this.d);
        arxc.y(parcel, 7, b(), false);
        arxc.c(parcel, a);
    }
}
