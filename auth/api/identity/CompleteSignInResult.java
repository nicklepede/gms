package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.zcp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CompleteSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zcp();
    public final SignInCredential a;

    public CompleteSignInResult(SignInCredential signInCredential) {
        arwm.s(signInCredential);
        this.a = signInCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignInCredential signInCredential = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, signInCredential, i, false);
        arxc.c(parcel, a);
    }
}
