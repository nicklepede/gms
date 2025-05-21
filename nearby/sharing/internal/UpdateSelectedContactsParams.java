package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.Contact;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cncm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class UpdateSelectedContactsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cncm();
    public Contact[] a;
    public Contact[] b;
    public arbp c;

    private UpdateSelectedContactsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateSelectedContactsParams) {
            UpdateSelectedContactsParams updateSelectedContactsParams = (UpdateSelectedContactsParams) obj;
            if (Arrays.equals(this.a, updateSelectedContactsParams.a) && Arrays.equals(this.b, updateSelectedContactsParams.b) && arwb.b(this.c, updateSelectedContactsParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.J(parcel, 2, this.b, i);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.c(parcel, a);
    }

    public UpdateSelectedContactsParams(Contact[] contactArr, Contact[] contactArr2, IBinder iBinder) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = contactArr;
        this.b = contactArr2;
        this.c = arbnVar;
    }
}
