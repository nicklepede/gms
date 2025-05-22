package com.google.android.gms.appinvite.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.vtl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SourcedContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vtl();
    public final ContactPerson a;
    public final int b;

    public SourcedContactPerson(ContactPerson contactPerson, int i) {
        this.a = contactPerson;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SourcedContactPerson sourcedContactPerson = (SourcedContactPerson) obj;
            if (atyq.b(this.a, sourcedContactPerson.a)) {
                if (atyq.b(Integer.valueOf(this.b), Integer.valueOf(sourcedContactPerson.b))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourcedContactPerson{");
        ContactPerson contactPerson = this.a;
        if (contactPerson != null) {
            sb.append(" person=");
            sb.append(contactPerson.toString());
        }
        sb.append(" personSource=");
        sb.append(this.b);
        sb.append(" }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.o(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
