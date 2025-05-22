package com.google.android.gms.family.v2.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.model.AvatarReference;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bcga;
import defpackage.bcgb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bcgb();
    public final String a;
    public final Long b;
    public final AvatarReference c;
    public final ArrayList d;
    public final Uri e;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ContactMethod extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new bcga();
        public final int a;
        public final String b;

        public ContactMethod(int i, String str) {
            this.a = i;
            this.b = str;
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
            atzr.o(parcel, 1, i2);
            atzr.v(parcel, 2, this.b, false);
            atzr.c(parcel, a);
        }
    }

    public ContactPerson(String str, Long l, AvatarReference avatarReference, Uri uri) {
        this.d = new ArrayList();
        this.a = str;
        this.b = l;
        this.c = avatarReference;
        this.e = uri;
    }

    public final void a(List list) {
        this.d.addAll(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContactPerson contactPerson = (ContactPerson) obj;
            if (atyq.b(this.a, contactPerson.a) && atyq.b(this.b, contactPerson.b) && atyq.b(new HashSet(this.d), new HashSet(contactPerson.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactPerson{");
        String str = this.a;
        if (!TextUtils.isEmpty(str)) {
            sb.append(" name=");
            sb.append(str);
        }
        Long l = this.b;
        if (l != null) {
            sb.append(" cp2Id=");
            sb.append(l);
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.I(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }

    public ContactPerson(String str, Long l, AvatarReference avatarReference, List list, Uri uri) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = str;
        this.b = l;
        this.c = avatarReference;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.e = uri;
    }
}
