package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwcg;
import defpackage.ekus;
import defpackage.elgo;
import defpackage.elpg;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwcg();
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

    public final elgo a() {
        List list = this.e;
        if (list != null) {
            return elgo.i(list);
        }
        int i = elgo.d;
        return elpg.a;
    }

    public final List b() {
        List list = this.g;
        if (list != null) {
            return elgo.i(list);
        }
        int i = elgo.d;
        return elpg.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) obj;
        return this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && ekus.a(this.f, contactsConsentsCoarseStatus.f) && ekus.a(this.e, contactsConsentsCoarseStatus.e) && ekus.a(this.c, contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && ekus.a(this.g, contactsConsentsCoarseStatus.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.e, this.f, this.c, Boolean.valueOf(this.d), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        elgo i2;
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.b);
        atzr.y(parcel, 3, a(), false);
        List list = this.f;
        if (list == null) {
            int i3 = elgo.d;
            i2 = elpg.a;
        } else {
            i2 = elgo.i(list);
        }
        atzr.y(parcel, 4, i2, false);
        atzr.v(parcel, 5, this.c, false);
        atzr.e(parcel, 6, this.d);
        atzr.y(parcel, 7, b(), false);
        atzr.c(parcel, a);
    }
}
