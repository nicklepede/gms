package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dewp;
import defpackage.eiuu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dewp();
    final boolean A;
    public final long B;
    final long C;
    final boolean D;
    public final long E;
    final String F;
    final String G;
    final CardRewardsInfo H;
    final int I;
    final boolean J;
    final String K;
    final int L;
    final boolean M;
    final long N;
    final String O;
    final int P;
    final List Q;
    final SeInfo R;
    final String S;
    final String T;
    final String U;
    final long V;
    final int W;
    final int X;
    final int Y;
    public final String a;
    final String b;
    final byte[] c;
    final String d;
    public final String e;
    public final int f;
    public final TokenStatus g;
    public final String h;
    public final Uri i;
    final int j;
    final int k;
    final IssuerInfo l;
    final String m;
    final TransactionInfo n;
    final String o;
    public final byte[] p;
    final int q;
    final int r;
    public final int s;
    final InStoreCvmConfig t;
    final InAppCvmConfig u;
    final String v;
    public final OnlineAccountCardLinkInfo[] w;
    final boolean x;
    final List y;
    final boolean z;

    static {
        eiuu.K(10, 9);
    }

    public CardInfo(String str, String str2, byte[] bArr, String str3, String str4, int i, TokenStatus tokenStatus, String str5, Uri uri, int i2, int i3, IssuerInfo issuerInfo, String str6, TransactionInfo transactionInfo, String str7, byte[] bArr2, int i4, int i5, int i6, InStoreCvmConfig inStoreCvmConfig, InAppCvmConfig inAppCvmConfig, String str8, OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr, boolean z, List list, boolean z2, boolean z3, long j, long j2, boolean z4, long j3, String str9, String str10, CardRewardsInfo cardRewardsInfo, int i7, boolean z5, String str11, int i8, boolean z6, long j4, String str12, int i9, List list2, SeInfo seInfo, String str13, String str14, String str15, long j5, int i10, int i11, int i12) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = tokenStatus;
        this.h = str5;
        this.i = uri;
        this.j = i2;
        this.k = i3;
        this.l = issuerInfo;
        this.m = str6;
        this.n = transactionInfo;
        this.o = str7;
        this.p = bArr2;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = inStoreCvmConfig;
        this.u = inAppCvmConfig;
        this.v = str8;
        this.w = onlineAccountCardLinkInfoArr;
        this.x = z;
        this.y = list;
        this.z = z2;
        this.A = z3;
        this.B = j;
        this.C = j2;
        this.D = z4;
        this.E = j3;
        this.F = str9;
        this.G = str10;
        this.H = cardRewardsInfo;
        this.I = i7;
        this.J = z5;
        this.K = str11;
        this.L = i8;
        this.M = z6;
        this.N = j4;
        this.O = str12;
        this.P = i9;
        this.Q = list2;
        this.R = seInfo;
        this.S = str13;
        this.T = str14;
        this.U = str15;
        this.V = j5;
        this.W = i10;
        this.X = i11;
        this.Y = i12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (arwb.b(this.a, cardInfo.a) && arwb.b(this.b, cardInfo.b) && Arrays.equals(this.c, cardInfo.c) && arwb.b(this.d, cardInfo.d) && arwb.b(this.e, cardInfo.e) && this.f == cardInfo.f && arwb.b(this.g, cardInfo.g) && arwb.b(this.h, cardInfo.h) && arwb.b(this.i, cardInfo.i) && this.j == cardInfo.j && this.k == cardInfo.k && arwb.b(this.l, cardInfo.l) && arwb.b(this.m, cardInfo.m) && arwb.b(this.n, cardInfo.n) && this.q == cardInfo.q && this.r == cardInfo.r && this.s == cardInfo.s && arwb.b(this.t, cardInfo.t) && arwb.b(this.u, cardInfo.u) && arwb.b(this.v, cardInfo.v) && Arrays.equals(this.w, cardInfo.w) && this.x == cardInfo.x && arwb.b(this.y, cardInfo.y) && this.z == cardInfo.z && this.A == cardInfo.A && this.B == cardInfo.B && this.D == cardInfo.D && this.E == cardInfo.E && arwb.b(this.F, cardInfo.F) && arwb.b(this.G, cardInfo.G) && arwb.b(this.H, cardInfo.H) && this.I == cardInfo.I && this.J == cardInfo.J && this.L == cardInfo.L && this.M == cardInfo.M && this.P == cardInfo.P && this.N == cardInfo.N && arwb.b(this.O, cardInfo.O) && arwb.b(this.Q, cardInfo.Q) && arwb.b(this.R, cardInfo.R) && arwb.b(this.S, cardInfo.S) && arwb.b(this.T, cardInfo.T) && arwb.b(this.U, cardInfo.U) && this.V == cardInfo.V && this.W == cardInfo.W && this.X == cardInfo.X && this.Y == cardInfo.Y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.f), this.g, this.h, this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), this.m, this.n, Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.s), this.t, this.u, this.v, this.w, Boolean.valueOf(this.x), this.y, Boolean.valueOf(this.z), Boolean.valueOf(this.A), Long.valueOf(this.B), Boolean.valueOf(this.D), Long.valueOf(this.E), this.F, this.G, this.H, Integer.valueOf(this.I), Boolean.valueOf(this.J), Integer.valueOf(this.L), Boolean.valueOf(this.M), Long.valueOf(this.N), this.O, Integer.valueOf(this.P), this.Q, this.R, this.S, this.T, this.U, Long.valueOf(this.V), Integer.valueOf(this.W), Integer.valueOf(this.X), Integer.valueOf(this.Y)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("billingCardId", this.a, arrayList);
        arwa.b("auxClientTokenId", this.b, arrayList);
        byte[] bArr = this.c;
        arwa.b("serverToken", bArr == null ? null : Arrays.toString(bArr), arrayList);
        arwa.b("cardholderName", this.d, arrayList);
        arwa.b("displayName", this.e, arrayList);
        arwa.b("cardNetwork", Integer.valueOf(this.f), arrayList);
        arwa.b("tokenStatus", this.g, arrayList);
        arwa.b("panLastDigits", this.h, arrayList);
        arwa.b("cardImageUrl", this.i, arrayList);
        arwa.b("cardColor", Integer.valueOf(this.j), arrayList);
        arwa.b("overlayTextColor", Integer.valueOf(this.k), arrayList);
        IssuerInfo issuerInfo = this.l;
        arwa.b("issuerInfo", issuerInfo == null ? null : issuerInfo.toString(), arrayList);
        arwa.b("tokenLastDigits", this.m, arrayList);
        arwa.b("transactionInfo", this.n, arrayList);
        arwa.b("issuerTokenId", this.o, arrayList);
        byte[] bArr2 = this.p;
        arwa.b("inAppCardToken", bArr2 == null ? null : Arrays.toString(bArr2), arrayList);
        arwa.b("cachedEligibility", Integer.valueOf(this.q), arrayList);
        arwa.b("paymentProtocol", Integer.valueOf(this.r), arrayList);
        arwa.b("tokenType", Integer.valueOf(this.s), arrayList);
        arwa.b("inStoreCvmConfig", this.t, arrayList);
        arwa.b("inAppCvmConfig", this.u, arrayList);
        arwa.b("tokenDisplayName", this.v, arrayList);
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = this.w;
        arwa.b("onlineAccountCardLinkInfos", onlineAccountCardLinkInfoArr == null ? null : Arrays.toString(onlineAccountCardLinkInfoArr), arrayList);
        arwa.b("allowAidSelection", Boolean.valueOf(this.x), arrayList);
        arwa.b("badges", "[" + TextUtils.join(", ", this.y) + "]", arrayList);
        arwa.b("upgradeAvailable", Boolean.valueOf(this.z), arrayList);
        arwa.b("requiresSignature", Boolean.valueOf(this.A), arrayList);
        arwa.b("googleTokenId", Long.valueOf(this.B), arrayList);
        arwa.b("isTransit", Boolean.valueOf(this.D), arrayList);
        arwa.b("googleWalletId", Long.valueOf(this.E), arrayList);
        arwa.b("devicePaymentMethodId", this.F, arrayList);
        arwa.b("cloudPaymentMethodId", this.G, arrayList);
        arwa.b("auxiliaryGoogleTokenId", Long.valueOf(this.N), arrayList);
        arwa.b("auxiliaryIssuerTokenId", this.O, arrayList);
        arwa.b("auxiliaryNetwork", Integer.valueOf(this.P), arrayList);
        List list = this.Q;
        arwa.b("cobadgedDefaultOrderOfPaymentNetwork", list != null ? list.toString() : null, arrayList);
        arwa.b("seInfo", this.R, arrayList);
        arwa.b("rawPrevPanLastDigits", this.S, arrayList);
        arwa.b("prevPanDisplayName", this.T, arrayList);
        arwa.b("cardDisplayName", this.U, arrayList);
        arwa.b("BillingCustomerNumber", Long.valueOf(this.V), arrayList);
        arwa.b("applicationPriorityIndicatorOverride", Integer.valueOf(this.W), arrayList);
        arwa.b("auxiliaryApplicationPriorityIndicatorOverride", Integer.valueOf(this.X), arrayList);
        arwa.b("tokenizationMethod", Integer.valueOf(this.Y), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.o(parcel, 10, this.j);
        arxc.o(parcel, 11, this.k);
        arxc.t(parcel, 12, this.l, i, false);
        arxc.v(parcel, 13, this.m, false);
        arxc.t(parcel, 15, this.n, i, false);
        arxc.v(parcel, 16, this.o, false);
        arxc.i(parcel, 17, this.p, false);
        arxc.o(parcel, 18, this.q);
        arxc.o(parcel, 20, this.r);
        arxc.o(parcel, 21, this.s);
        arxc.t(parcel, 22, this.t, i, false);
        arxc.t(parcel, 23, this.u, i, false);
        arxc.v(parcel, 24, this.v, false);
        arxc.J(parcel, 25, this.w, i);
        arxc.e(parcel, 26, this.x);
        arxc.y(parcel, 27, this.y, false);
        arxc.e(parcel, 28, this.z);
        arxc.e(parcel, 29, this.A);
        arxc.q(parcel, 30, this.B);
        arxc.q(parcel, 31, this.C);
        arxc.e(parcel, 32, this.D);
        arxc.q(parcel, 33, this.E);
        arxc.v(parcel, 34, this.F, false);
        arxc.v(parcel, 35, this.G, false);
        arxc.t(parcel, 36, this.H, i, false);
        arxc.o(parcel, 37, this.I);
        arxc.e(parcel, 38, this.J);
        arxc.v(parcel, 39, this.K, false);
        arxc.o(parcel, 40, this.L);
        arxc.e(parcel, 41, this.M);
        arxc.q(parcel, 42, this.N);
        arxc.v(parcel, 43, this.O, false);
        arxc.o(parcel, 44, this.P);
        arxc.v(parcel, 45, this.b, false);
        arxc.E(parcel, 47, this.Q);
        arxc.t(parcel, 48, this.R, i, false);
        arxc.v(parcel, 49, this.S, false);
        arxc.v(parcel, 50, this.T, false);
        arxc.v(parcel, 51, this.U, false);
        arxc.q(parcel, 52, this.V);
        arxc.o(parcel, 53, this.W);
        arxc.o(parcel, 54, this.X);
        arxc.o(parcel, 55, this.Y);
        arxc.c(parcel, a);
    }
}
