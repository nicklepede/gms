package com.google.android.gms.appinvite.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.model.AvatarReference;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.vtj;
import defpackage.vtk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vtk();
    public String a;
    public String b;
    public Long c;
    public AvatarReference d;
    public final ArrayList e;
    int f;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ContactMethod extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new vtj();
        public final int a;
        public final String b;
        public final AvatarReference c;

        public ContactMethod(int i, String str, AvatarReference avatarReference) {
            this.a = i;
            this.b = str;
            this.c = avatarReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactMethod)) {
                return false;
            }
            ContactMethod contactMethod = (ContactMethod) obj;
            return this.a == contactMethod.a && atyq.b(this.b, contactMethod.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = atzr.a(parcel);
            atzr.o(parcel, 2, i2);
            atzr.v(parcel, 3, this.b, false);
            atzr.t(parcel, 4, this.c, i, false);
            atzr.c(parcel, a);
        }

        public ContactMethod(int i, String str) {
            this(i, str, null);
        }
    }

    public ContactPerson(String str, String str2, AvatarReference avatarReference, List list) {
        this(str, str2, null, avatarReference, list, 0);
    }

    public final ContactMethod a() {
        ArrayList arrayList = this.e;
        if (this.f < arrayList.size()) {
            return (ContactMethod) arrayList.get(this.f);
        }
        return null;
    }

    public final void b(ContactMethod contactMethod) {
        if (contactMethod == null) {
            this.f = this.e.size();
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList.contains(contactMethod)) {
            this.f = arrayList.indexOf(contactMethod);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactPerson)) {
            return false;
        }
        ContactPerson contactPerson = (ContactPerson) obj;
        return atyq.b(this.a, contactPerson.a) && atyq.b(this.b, contactPerson.b) && atyq.b(this.c, contactPerson.c) && atyq.b(this.e, contactPerson.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactPerson{");
        if (!TextUtils.isEmpty(this.a)) {
            sb.append(" name=");
            sb.append(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(" gaiaId=");
            sb.append(this.b);
        }
        if (this.c != null) {
            sb.append(" cp2Id=");
            sb.append(this.c);
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.I(parcel, 4, this.c);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.y(parcel, 6, this.e, false);
        atzr.o(parcel, 7, this.f);
        atzr.c(parcel, a);
    }

    public ContactPerson(String str, String str2, Long l, AvatarReference avatarReference, List list, int i) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = avatarReference;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f = i;
    }
}
