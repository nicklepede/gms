package com.google.android.gms.appinvite.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.txm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SourcedContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new txm();
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
            if (arwb.b(this.a, sourcedContactPerson.a)) {
                if (arwb.b(Integer.valueOf(this.b), Integer.valueOf(sourcedContactPerson.b))) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.o(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
