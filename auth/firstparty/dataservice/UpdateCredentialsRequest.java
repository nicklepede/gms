package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazp;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UpdateCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazp();
    final int a;
    public AccountCredentials b;
    public CaptchaSolution c;

    public UpdateCredentialsRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }

    public UpdateCredentialsRequest(int i, AccountCredentials accountCredentials, CaptchaSolution captchaSolution) {
        this.a = i;
        this.b = accountCredentials;
        this.c = captchaSolution;
    }
}
