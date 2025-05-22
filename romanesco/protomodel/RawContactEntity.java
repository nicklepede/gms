package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czzu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RawContactEntity extends AbstractSafeParcelable implements RawContact {
    public static final Parcelable.Creator CREATOR = new czzu();
    public final String a;
    private final List b;
    private final List c;
    private List d;
    private List e;

    public RawContactEntity(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    @Override // com.google.android.gms.romanesco.protomodel.RawContact
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.romanesco.protomodel.RawContact
    public final List b() {
        List list;
        if (this.d == null && (list = this.b) != null) {
            this.d = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.d.add((EmailAddress) it.next());
            }
        }
        return this.d;
    }

    @Override // com.google.android.gms.romanesco.protomodel.RawContact
    public final List c() {
        List list;
        if (this.e == null && (list = this.c) != null) {
            this.e = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.e.add((PhoneNumber) it.next());
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RawContact)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        RawContact rawContact = (RawContact) obj;
        return atyq.b(a(), rawContact.a()) && atyq.b(b(), rawContact.b()) && atyq.b(c(), rawContact.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.y(parcel, 4, b(), false);
        atzr.y(parcel, 5, c(), false);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
