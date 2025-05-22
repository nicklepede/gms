package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhht;
import defpackage.elhz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dhht();
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
        elhz.K(10, 9);
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
            if (atyq.b(this.a, cardInfo.a) && atyq.b(this.b, cardInfo.b) && Arrays.equals(this.c, cardInfo.c) && atyq.b(this.d, cardInfo.d) && atyq.b(this.e, cardInfo.e) && this.f == cardInfo.f && atyq.b(this.g, cardInfo.g) && atyq.b(this.h, cardInfo.h) && atyq.b(this.i, cardInfo.i) && this.j == cardInfo.j && this.k == cardInfo.k && atyq.b(this.l, cardInfo.l) && atyq.b(this.m, cardInfo.m) && atyq.b(this.n, cardInfo.n) && this.q == cardInfo.q && this.r == cardInfo.r && this.s == cardInfo.s && atyq.b(this.t, cardInfo.t) && atyq.b(this.u, cardInfo.u) && atyq.b(this.v, cardInfo.v) && Arrays.equals(this.w, cardInfo.w) && this.x == cardInfo.x && atyq.b(this.y, cardInfo.y) && this.z == cardInfo.z && this.A == cardInfo.A && this.B == cardInfo.B && this.D == cardInfo.D && this.E == cardInfo.E && atyq.b(this.F, cardInfo.F) && atyq.b(this.G, cardInfo.G) && atyq.b(this.H, cardInfo.H) && this.I == cardInfo.I && this.J == cardInfo.J && this.L == cardInfo.L && this.M == cardInfo.M && this.P == cardInfo.P && this.N == cardInfo.N && atyq.b(this.O, cardInfo.O) && atyq.b(this.Q, cardInfo.Q) && atyq.b(this.R, cardInfo.R) && atyq.b(this.S, cardInfo.S) && atyq.b(this.T, cardInfo.T) && atyq.b(this.U, cardInfo.U) && this.V == cardInfo.V && this.W == cardInfo.W && this.X == cardInfo.X && this.Y == cardInfo.Y) {
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
        atyp.b("billingCardId", this.a, arrayList);
        atyp.b("auxClientTokenId", this.b, arrayList);
        byte[] bArr = this.c;
        atyp.b("serverToken", bArr == null ? null : Arrays.toString(bArr), arrayList);
        atyp.b("cardholderName", this.d, arrayList);
        atyp.b("displayName", this.e, arrayList);
        atyp.b("cardNetwork", Integer.valueOf(this.f), arrayList);
        atyp.b("tokenStatus", this.g, arrayList);
        atyp.b("panLastDigits", this.h, arrayList);
        atyp.b("cardImageUrl", this.i, arrayList);
        atyp.b("cardColor", Integer.valueOf(this.j), arrayList);
        atyp.b("overlayTextColor", Integer.valueOf(this.k), arrayList);
        IssuerInfo issuerInfo = this.l;
        atyp.b("issuerInfo", issuerInfo == null ? null : issuerInfo.toString(), arrayList);
        atyp.b("tokenLastDigits", this.m, arrayList);
        atyp.b("transactionInfo", this.n, arrayList);
        atyp.b("issuerTokenId", this.o, arrayList);
        byte[] bArr2 = this.p;
        atyp.b("inAppCardToken", bArr2 == null ? null : Arrays.toString(bArr2), arrayList);
        atyp.b("cachedEligibility", Integer.valueOf(this.q), arrayList);
        atyp.b("paymentProtocol", Integer.valueOf(this.r), arrayList);
        atyp.b("tokenType", Integer.valueOf(this.s), arrayList);
        atyp.b("inStoreCvmConfig", this.t, arrayList);
        atyp.b("inAppCvmConfig", this.u, arrayList);
        atyp.b("tokenDisplayName", this.v, arrayList);
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = this.w;
        atyp.b("onlineAccountCardLinkInfos", onlineAccountCardLinkInfoArr == null ? null : Arrays.toString(onlineAccountCardLinkInfoArr), arrayList);
        atyp.b("allowAidSelection", Boolean.valueOf(this.x), arrayList);
        atyp.b("badges", "[" + TextUtils.join(", ", this.y) + "]", arrayList);
        atyp.b("upgradeAvailable", Boolean.valueOf(this.z), arrayList);
        atyp.b("requiresSignature", Boolean.valueOf(this.A), arrayList);
        atyp.b("googleTokenId", Long.valueOf(this.B), arrayList);
        atyp.b("isTransit", Boolean.valueOf(this.D), arrayList);
        atyp.b("googleWalletId", Long.valueOf(this.E), arrayList);
        atyp.b("devicePaymentMethodId", this.F, arrayList);
        atyp.b("cloudPaymentMethodId", this.G, arrayList);
        atyp.b("auxiliaryGoogleTokenId", Long.valueOf(this.N), arrayList);
        atyp.b("auxiliaryIssuerTokenId", this.O, arrayList);
        atyp.b("auxiliaryNetwork", Integer.valueOf(this.P), arrayList);
        List list = this.Q;
        atyp.b("cobadgedDefaultOrderOfPaymentNetwork", list != null ? list.toString() : null, arrayList);
        atyp.b("seInfo", this.R, arrayList);
        atyp.b("rawPrevPanLastDigits", this.S, arrayList);
        atyp.b("prevPanDisplayName", this.T, arrayList);
        atyp.b("cardDisplayName", this.U, arrayList);
        atyp.b("BillingCustomerNumber", Long.valueOf(this.V), arrayList);
        atyp.b("applicationPriorityIndicatorOverride", Integer.valueOf(this.W), arrayList);
        atyp.b("auxiliaryApplicationPriorityIndicatorOverride", Integer.valueOf(this.X), arrayList);
        atyp.b("tokenizationMethod", Integer.valueOf(this.Y), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.o(parcel, 10, this.j);
        atzr.o(parcel, 11, this.k);
        atzr.t(parcel, 12, this.l, i, false);
        atzr.v(parcel, 13, this.m, false);
        atzr.t(parcel, 15, this.n, i, false);
        atzr.v(parcel, 16, this.o, false);
        atzr.i(parcel, 17, this.p, false);
        atzr.o(parcel, 18, this.q);
        atzr.o(parcel, 20, this.r);
        atzr.o(parcel, 21, this.s);
        atzr.t(parcel, 22, this.t, i, false);
        atzr.t(parcel, 23, this.u, i, false);
        atzr.v(parcel, 24, this.v, false);
        atzr.J(parcel, 25, this.w, i);
        atzr.e(parcel, 26, this.x);
        atzr.y(parcel, 27, this.y, false);
        atzr.e(parcel, 28, this.z);
        atzr.e(parcel, 29, this.A);
        atzr.q(parcel, 30, this.B);
        atzr.q(parcel, 31, this.C);
        atzr.e(parcel, 32, this.D);
        atzr.q(parcel, 33, this.E);
        atzr.v(parcel, 34, this.F, false);
        atzr.v(parcel, 35, this.G, false);
        atzr.t(parcel, 36, this.H, i, false);
        atzr.o(parcel, 37, this.I);
        atzr.e(parcel, 38, this.J);
        atzr.v(parcel, 39, this.K, false);
        atzr.o(parcel, 40, this.L);
        atzr.e(parcel, 41, this.M);
        atzr.q(parcel, 42, this.N);
        atzr.v(parcel, 43, this.O, false);
        atzr.o(parcel, 44, this.P);
        atzr.v(parcel, 45, this.b, false);
        atzr.E(parcel, 47, this.Q);
        atzr.t(parcel, 48, this.R, i, false);
        atzr.v(parcel, 49, this.S, false);
        atzr.v(parcel, 50, this.T, false);
        atzr.v(parcel, 51, this.U, false);
        atzr.q(parcel, 52, this.V);
        atzr.o(parcel, 53, this.W);
        atzr.o(parcel, 54, this.X);
        atzr.o(parcel, 55, this.Y);
        atzr.c(parcel, a);
    }
}
