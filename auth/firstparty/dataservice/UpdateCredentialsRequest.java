package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aczp;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UpdateCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aczp();
    final int a;
    public AccountCredentials b;
    public CaptchaSolution c;

    public UpdateCredentialsRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public UpdateCredentialsRequest(int i, AccountCredentials accountCredentials, CaptchaSolution captchaSolution) {
        this.a = i;
        this.b = accountCredentials;
        this.c = captchaSolution;
    }
}
