package com.google.android.gms.auth.api.fido;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bmfz;
import defpackage.jbn;
import defpackage.yzw;
import defpackage.zae;
import defpackage.zal;
import defpackage.zav;
import defpackage.zaw;
import defpackage.zax;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RegistrationOptions extends AbstractSafeParcelable implements zax {
    public static final Parcelable.Creator CREATOR = new zaw();
    public final PublicKeyCredentialCreationOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final Account e;
    public final bmfz f;
    public final jbn g;
    public final boolean h;
    public final long i;

    public RegistrationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, String str2, BrowserOptions browserOptions, Account account, bmfz bmfzVar, jbn jbnVar, Boolean bool, long j) {
        arwm.c(j > 0, "Must provide a valid endTime.");
        arwm.s(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        arwm.s(str);
        this.b = str;
        arwm.s(str2);
        this.c = str2;
        this.d = browserOptions;
        this.e = account;
        this.f = bmfzVar;
        this.g = jbnVar;
        this.h = bool.booleanValue();
        this.i = j;
    }

    public static zav c() {
        zav zavVar = new zav();
        zavVar.e = false;
        return zavVar;
    }

    @Override // defpackage.zaf
    public final /* synthetic */ Uri a() {
        return zae.a(this);
    }

    @Override // defpackage.yzy
    public final jbn b() {
        return this.g;
    }

    @Override // defpackage.zaf
    public final BrowserOptions d() {
        return this.d;
    }

    @Override // defpackage.zan
    public final bmfz e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegistrationOptions)) {
            return false;
        }
        RegistrationOptions registrationOptions = (RegistrationOptions) obj;
        return arwb.b(this.a, registrationOptions.a) && arwb.b(this.b, registrationOptions.b) && arwb.b(this.c, registrationOptions.c) && arwb.b(this.d, registrationOptions.d) && arwb.b(this.e, registrationOptions.e) && arwb.b(this.f, registrationOptions.f) && arwb.b(this.g, registrationOptions.g) && arwb.b(Boolean.valueOf(this.h), Boolean.valueOf(registrationOptions.h)) && this.i == registrationOptions.i;
    }

    @Override // defpackage.zax
    public final String f() {
        return this.c;
    }

    @Override // defpackage.zax
    public final String g() {
        return this.b;
    }

    @Override // defpackage.zax
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Long.valueOf(this.i)});
    }

    @Override // defpackage.zaf
    public final /* synthetic */ boolean i() {
        return zae.e(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.o(parcel, 7, zal.a(this));
        arxc.g(parcel, 8, yzw.a(this), false);
        arxc.e(parcel, 9, this.h);
        arxc.q(parcel, 10, this.i);
        arxc.c(parcel, a);
    }
}
