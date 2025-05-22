package com.google.android.gms.auth.api.fido;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazm;
import defpackage.aazu;
import defpackage.abac;
import defpackage.abam;
import defpackage.aban;
import defpackage.abao;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bomr;
import defpackage.jdd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RegistrationOptions extends AbstractSafeParcelable implements abao {
    public static final Parcelable.Creator CREATOR = new aban();
    public final PublicKeyCredentialCreationOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final Account e;
    public final bomr f;
    public final jdd g;
    public final boolean h;
    public final long i;
    public final ResultReceiver j;

    public RegistrationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, String str2, BrowserOptions browserOptions, Account account, bomr bomrVar, jdd jddVar, Boolean bool, long j, ResultReceiver resultReceiver) {
        atzb.c(j > 0, "Must provide a valid endTime.");
        atzb.s(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        atzb.s(str);
        this.b = str;
        atzb.s(str2);
        this.c = str2;
        this.d = browserOptions;
        this.e = account;
        this.f = bomrVar;
        this.g = jddVar;
        this.h = bool.booleanValue();
        this.i = j;
        this.j = resultReceiver;
    }

    public static abam d() {
        abam abamVar = new abam();
        abamVar.e = false;
        return abamVar;
    }

    @Override // defpackage.aazv
    public final /* synthetic */ Uri a() {
        return aazu.a(this);
    }

    @Override // defpackage.abao
    public final ResultReceiver b() {
        return this.j;
    }

    @Override // defpackage.aazo
    public final jdd c() {
        return this.g;
    }

    @Override // defpackage.aazv
    public final BrowserOptions e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegistrationOptions)) {
            return false;
        }
        RegistrationOptions registrationOptions = (RegistrationOptions) obj;
        return atyq.b(this.a, registrationOptions.a) && atyq.b(this.b, registrationOptions.b) && atyq.b(this.c, registrationOptions.c) && atyq.b(this.d, registrationOptions.d) && atyq.b(this.e, registrationOptions.e) && atyq.b(this.f, registrationOptions.f) && atyq.b(this.g, registrationOptions.g) && atyq.b(Boolean.valueOf(this.h), Boolean.valueOf(registrationOptions.h)) && this.i == registrationOptions.i && this.j == registrationOptions.j;
    }

    @Override // defpackage.abae
    public final bomr f() {
        return this.f;
    }

    @Override // defpackage.abao
    public final String g() {
        return this.c;
    }

    @Override // defpackage.abao
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Long.valueOf(this.i), this.j});
    }

    @Override // defpackage.abao
    public final boolean i() {
        return this.h;
    }

    @Override // defpackage.aazv
    public final /* synthetic */ boolean j() {
        return aazu.e(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.o(parcel, 7, abac.a(this));
        atzr.g(parcel, 8, aazm.a(this), false);
        atzr.e(parcel, 9, this.h);
        atzr.q(parcel, 10, this.i);
        atzr.t(parcel, 11, this.j, i, false);
        atzr.c(parcel, a);
    }
}
