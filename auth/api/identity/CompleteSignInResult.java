package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abck;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CompleteSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abck();
    public final SignInCredential a;

    public CompleteSignInResult(SignInCredential signInCredential) {
        atzb.s(signInCredential);
        this.a = signInCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignInCredential signInCredential = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, signInCredential, i, false);
        atzr.c(parcel, a);
    }
}
