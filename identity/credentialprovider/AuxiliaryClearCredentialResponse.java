package com.google.android.gms.identity.credentialprovider;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bopb;
import defpackage.jas;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuxiliaryClearCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bopb();
    public final jas a;

    public AuxiliaryClearCredentialResponse(jas jasVar) {
        this.a = jasVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuxiliaryClearCredentialResponse) {
            return atyq.b(this.a, ((AuxiliaryClearCredentialResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int a = atzr.a(parcel);
        jas jasVar = this.a;
        if (jasVar == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_TYPE", jasVar.a());
            CharSequence charSequence = jasVar.a;
            if (charSequence != null) {
                bundle2.putCharSequence("androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_MESSAGE", charSequence);
            }
            bundle = bundle2;
        }
        atzr.g(parcel, 2, bundle, false);
        atzr.c(parcel, a);
    }
}
