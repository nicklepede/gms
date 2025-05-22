package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.Contact;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpku;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class UpdateSelectedContactsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpku();
    public Contact[] a;
    public Contact[] b;
    public atee c;

    private UpdateSelectedContactsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateSelectedContactsParams) {
            UpdateSelectedContactsParams updateSelectedContactsParams = (UpdateSelectedContactsParams) obj;
            if (Arrays.equals(this.a, updateSelectedContactsParams.a) && Arrays.equals(this.b, updateSelectedContactsParams.b) && atyq.b(this.c, updateSelectedContactsParams.c)) {
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
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.J(parcel, 2, this.b, i);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public UpdateSelectedContactsParams(Contact[] contactArr, Contact[] contactArr2, IBinder iBinder) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = contactArr;
        this.b = contactArr2;
        this.c = atecVar;
    }
}
