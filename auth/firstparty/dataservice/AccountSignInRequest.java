package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaxw;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaxw();
    final int a;
    public AppDescription b;
    public boolean c;
    public boolean d;
    public CaptchaSolution e;
    public AccountCredentials f;

    public AccountSignInRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }

    public AccountSignInRequest(int i, AppDescription appDescription, boolean z, boolean z2, CaptchaSolution captchaSolution, AccountCredentials accountCredentials) {
        this.a = i;
        this.b = appDescription;
        this.c = z;
        this.d = z2;
        this.e = captchaSolution;
        this.f = accountCredentials;
    }
}
