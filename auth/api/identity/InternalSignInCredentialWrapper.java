package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abcw;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.ekvg;
import defpackage.ekvh;
import defpackage.elgo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class InternalSignInCredentialWrapper extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new abcw();
    public static final Scope a = new Scope("profile");
    public static final Scope b = new Scope("email");
    public static final Scope c = new Scope("openid");
    public static final Scope d = new Scope("https://www.googleapis.com/auth/userinfo.profile");
    public static final Scope e = new Scope("https://www.googleapis.com/auth/userinfo.email");
    public final Account f;
    public final SignInCredential g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final boolean l;
    public final long m;
    public final String n;
    public final boolean o;
    public final Intent p;

    public InternalSignInCredentialWrapper(Account account, SignInCredential signInCredential, List list, boolean z, boolean z2, long j, boolean z3, long j2, String str, boolean z4, Intent intent) {
        this.f = account;
        atzb.s(signInCredential);
        this.g = signInCredential;
        if (!TextUtils.isEmpty(signInCredential.f)) {
            atzb.c(list.isEmpty(), "Password credentials should have empty granted-scopes list");
            atzb.c(!z, "Converted credentials should not contain the original password");
        }
        atzb.s(list);
        this.h = elgo.i(list);
        this.i = z;
        this.j = z2;
        this.k = j;
        this.l = z3;
        this.m = j2;
        this.n = str;
        this.o = z4;
        this.p = intent;
    }

    private final int d() {
        int i = this.j ? 100000 : this.g.f == null ? ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS : this.f != null ? 100 : 0;
        SignInCredential signInCredential = this.g;
        int i2 = true != TextUtils.isEmpty(signInCredential.b) ? 2 : 1;
        if (!TextUtils.isEmpty(signInCredential.c)) {
            i2++;
        }
        if (!TextUtils.isEmpty(signInCredential.d)) {
            i2++;
        }
        Uri uri = signInCredential.e;
        if (uri != null && !Uri.EMPTY.equals(uri)) {
            i2++;
        }
        return i + i2;
    }

    public final List a() {
        return new ArrayList(this.h);
    }

    public final boolean b() {
        return this.i || !TextUtils.isEmpty(this.g.f) || this.h.contains(c);
    }

    public final boolean c() {
        return this.l && b();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) obj;
        int d2 = d();
        int d3 = internalSignInCredentialWrapper.d();
        return d2 == d3 ? Long.compare(this.m, internalSignInCredentialWrapper.m) : Integer.compare(d2, d3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InternalSignInCredentialWrapper)) {
            return false;
        }
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) obj;
        return atyq.b(this.f, internalSignInCredentialWrapper.f) && atyq.b(this.g, internalSignInCredentialWrapper.g) && atyq.b(this.h, internalSignInCredentialWrapper.h) && this.i == internalSignInCredentialWrapper.i && this.j == internalSignInCredentialWrapper.j && this.k == internalSignInCredentialWrapper.k && this.l == internalSignInCredentialWrapper.l && this.m == internalSignInCredentialWrapper.m && atyq.b(this.n, internalSignInCredentialWrapper.n) && this.o == internalSignInCredentialWrapper.o && atyq.b(this.p, internalSignInCredentialWrapper.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j), Long.valueOf(this.k), Boolean.valueOf(this.l), Long.valueOf(this.m), this.n, Boolean.valueOf(this.o), this.p});
    }

    public final String toString() {
        ekvg b2 = ekvh.b(this);
        b2.b("owningAccount", this.f);
        b2.b("signInCredential", this.g);
        b2.b("grantedScopes", this.h);
        b2.h("representsConvertedCredential", this.i);
        b2.h("representsLinkedThirdPartyAccount", this.j);
        b2.g("linkingTimeInMillis", this.k);
        b2.h("autoSelectSupportedByAppAndAccount", this.l);
        b2.g("lastUsedTimeMillis", this.m);
        b2.b("originalAffiliation", this.n);
        b2.h("isUnicornAccount", this.o);
        b2.b("fullScreenConsentFlowIntent", this.p);
        return b2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.f;
        int a2 = atzr.a(parcel);
        atzr.t(parcel, 1, account, i, false);
        atzr.t(parcel, 2, this.g, i, false);
        atzr.y(parcel, 3, a(), false);
        atzr.e(parcel, 4, this.i);
        atzr.e(parcel, 5, this.j);
        atzr.q(parcel, 6, this.k);
        atzr.e(parcel, 7, this.l);
        atzr.q(parcel, 8, this.m);
        atzr.v(parcel, 9, this.n, false);
        atzr.e(parcel, 10, this.o);
        atzr.t(parcel, 11, this.p, i, false);
        atzr.c(parcel, a2);
    }
}
