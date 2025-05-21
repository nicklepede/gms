package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctds;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PayIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctds();
    public WearSuicaCardDetailIntentArgs A;
    public WearTransactionListIntentArgs B;
    public SecureElementPrepaidTosIntentArgs C;
    public SeCommuterPassDetailIntentArgs D;
    public ManagedSecureElementWalletIntentArgs E;
    public DriversLicenseIntentArgs F;
    public byte[] G;
    public AddBankAccountIntentArgs H;
    public FopListIntentArgs I;
    public SuwAddPaymentMethodIntentArgs J;
    public ViewValuableSearchLoyaltyCardProgramIntentArgs K;
    public MdocIntentArgs L;
    public EnterUserCreatedPassIntentArgs M;
    public CreateOrUpdateUserCreatedPassIntentArgs N;
    public WearPrepaidCardDetailIntentArgs O;
    public WearMfiAcquireUserConsentIntentArgs P;
    public Account a;
    public String b;
    public long c;
    public IntentSource d;
    public FopDetailIntentArgs e;
    public TransactionDetailIntentArgs f;
    public TransactionListIntentArgs g;
    public ClosedLoopCardIntentArgs h;
    public TransitDisplayCardIntentArgs i;
    public SaveTicketCentricIntentArgs j;
    public PaycacheSetupIntentArgs k;
    public TopUpIntentArgs l;
    public ValuableDetailIntentArgs m;
    public HomeIntentArgs n;
    public ValuableSaveIntentArgs o;
    public AddLoyaltyCardIntentArgs p;
    public AutoloadSettingsIntentArgs q;
    public LowBalanceNotificationSettingsIntentArgs r;
    public SePrepaidCardDetailIntentArgs s;
    public SePrepaidMfiCardDetailIntentArgs t;
    public ProvisionSePrepaidCardIntentArgs u;
    public WalletFrameworkIntentArgs v;
    public SelectPurchasablePassIntentArgs w;
    public WearCardManagementIntentArgs x;
    public WearClosedLoopCardIntentArgs y;
    public AddPaymentMethodIntentArgs z;

    public PayIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayIntentArgs) {
            PayIntentArgs payIntentArgs = (PayIntentArgs) obj;
            if (arwb.b(this.a, payIntentArgs.a) && arwb.b(this.b, payIntentArgs.b) && arwb.b(Long.valueOf(this.c), Long.valueOf(payIntentArgs.c)) && arwb.b(this.d, payIntentArgs.d) && arwb.b(this.e, payIntentArgs.e) && arwb.b(this.f, payIntentArgs.f) && arwb.b(this.g, payIntentArgs.g) && arwb.b(this.h, payIntentArgs.h) && arwb.b(this.i, payIntentArgs.i) && arwb.b(this.j, payIntentArgs.j) && arwb.b(this.k, payIntentArgs.k) && arwb.b(this.l, payIntentArgs.l) && arwb.b(this.m, payIntentArgs.m) && arwb.b(this.n, payIntentArgs.n) && arwb.b(this.o, payIntentArgs.o) && arwb.b(this.p, payIntentArgs.p) && arwb.b(this.q, payIntentArgs.q) && arwb.b(this.r, payIntentArgs.r) && arwb.b(this.s, payIntentArgs.s) && arwb.b(this.t, payIntentArgs.t) && arwb.b(this.u, payIntentArgs.u) && arwb.b(this.v, payIntentArgs.v) && arwb.b(this.w, payIntentArgs.w) && arwb.b(this.x, payIntentArgs.x) && arwb.b(this.y, payIntentArgs.y) && arwb.b(this.z, payIntentArgs.z) && arwb.b(this.A, payIntentArgs.A) && arwb.b(this.B, payIntentArgs.B) && arwb.b(this.C, payIntentArgs.C) && arwb.b(this.D, payIntentArgs.D) && arwb.b(this.E, payIntentArgs.E) && arwb.b(this.F, payIntentArgs.F) && Arrays.equals(this.G, payIntentArgs.G) && arwb.b(this.H, payIntentArgs.H) && arwb.b(this.I, payIntentArgs.I) && arwb.b(this.J, payIntentArgs.J) && arwb.b(this.K, payIntentArgs.K) && arwb.b(this.L, payIntentArgs.L) && arwb.b(this.M, payIntentArgs.M) && arwb.b(this.N, payIntentArgs.N) && arwb.b(this.O, payIntentArgs.O) && arwb.b(this.P, payIntentArgs.P)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, Integer.valueOf(Arrays.hashCode(this.G)), this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.e, i, false);
        arxc.t(parcel, 3, this.f, i, false);
        arxc.t(parcel, 4, this.g, i, false);
        arxc.t(parcel, 5, this.h, i, false);
        arxc.t(parcel, 6, this.i, i, false);
        arxc.t(parcel, 7, this.j, i, false);
        arxc.t(parcel, 8, this.k, i, false);
        arxc.t(parcel, 9, this.l, i, false);
        arxc.t(parcel, 10, this.m, i, false);
        arxc.t(parcel, 11, this.n, i, false);
        arxc.t(parcel, 12, this.o, i, false);
        arxc.t(parcel, 13, this.p, i, false);
        arxc.t(parcel, 14, this.q, i, false);
        arxc.t(parcel, 15, this.r, i, false);
        arxc.t(parcel, 16, this.s, i, false);
        arxc.t(parcel, 17, this.d, i, false);
        arxc.t(parcel, 18, this.v, i, false);
        arxc.t(parcel, 21, this.w, i, false);
        arxc.t(parcel, 22, this.x, i, false);
        arxc.v(parcel, 24, this.b, false);
        arxc.q(parcel, 25, this.c);
        arxc.t(parcel, 26, this.y, i, false);
        arxc.t(parcel, 27, this.z, i, false);
        arxc.t(parcel, 28, this.A, i, false);
        arxc.t(parcel, 29, this.B, i, false);
        arxc.t(parcel, 31, this.C, i, false);
        arxc.t(parcel, 33, this.D, i, false);
        arxc.t(parcel, 34, this.E, i, false);
        arxc.t(parcel, 35, this.F, i, false);
        arxc.t(parcel, 36, this.t, i, false);
        arxc.t(parcel, 37, this.u, i, false);
        arxc.i(parcel, 38, this.G, false);
        arxc.t(parcel, 39, this.H, i, false);
        arxc.t(parcel, 40, this.I, i, false);
        arxc.t(parcel, 41, this.J, i, false);
        arxc.t(parcel, 42, this.K, i, false);
        arxc.t(parcel, 43, this.L, i, false);
        arxc.t(parcel, 44, this.M, i, false);
        arxc.t(parcel, 45, this.N, i, false);
        arxc.t(parcel, 46, this.O, i, false);
        arxc.t(parcel, 47, this.P, i, false);
        arxc.c(parcel, a);
    }

    public PayIntentArgs(Account account, String str, long j, IntentSource intentSource, FopDetailIntentArgs fopDetailIntentArgs, TransactionDetailIntentArgs transactionDetailIntentArgs, TransactionListIntentArgs transactionListIntentArgs, ClosedLoopCardIntentArgs closedLoopCardIntentArgs, TransitDisplayCardIntentArgs transitDisplayCardIntentArgs, SaveTicketCentricIntentArgs saveTicketCentricIntentArgs, PaycacheSetupIntentArgs paycacheSetupIntentArgs, TopUpIntentArgs topUpIntentArgs, ValuableDetailIntentArgs valuableDetailIntentArgs, HomeIntentArgs homeIntentArgs, ValuableSaveIntentArgs valuableSaveIntentArgs, AddLoyaltyCardIntentArgs addLoyaltyCardIntentArgs, AutoloadSettingsIntentArgs autoloadSettingsIntentArgs, LowBalanceNotificationSettingsIntentArgs lowBalanceNotificationSettingsIntentArgs, SePrepaidCardDetailIntentArgs sePrepaidCardDetailIntentArgs, SePrepaidMfiCardDetailIntentArgs sePrepaidMfiCardDetailIntentArgs, ProvisionSePrepaidCardIntentArgs provisionSePrepaidCardIntentArgs, WalletFrameworkIntentArgs walletFrameworkIntentArgs, SelectPurchasablePassIntentArgs selectPurchasablePassIntentArgs, WearCardManagementIntentArgs wearCardManagementIntentArgs, WearClosedLoopCardIntentArgs wearClosedLoopCardIntentArgs, AddPaymentMethodIntentArgs addPaymentMethodIntentArgs, WearSuicaCardDetailIntentArgs wearSuicaCardDetailIntentArgs, WearTransactionListIntentArgs wearTransactionListIntentArgs, SecureElementPrepaidTosIntentArgs secureElementPrepaidTosIntentArgs, SeCommuterPassDetailIntentArgs seCommuterPassDetailIntentArgs, ManagedSecureElementWalletIntentArgs managedSecureElementWalletIntentArgs, DriversLicenseIntentArgs driversLicenseIntentArgs, byte[] bArr, AddBankAccountIntentArgs addBankAccountIntentArgs, FopListIntentArgs fopListIntentArgs, SuwAddPaymentMethodIntentArgs suwAddPaymentMethodIntentArgs, ViewValuableSearchLoyaltyCardProgramIntentArgs viewValuableSearchLoyaltyCardProgramIntentArgs, MdocIntentArgs mdocIntentArgs, EnterUserCreatedPassIntentArgs enterUserCreatedPassIntentArgs, CreateOrUpdateUserCreatedPassIntentArgs createOrUpdateUserCreatedPassIntentArgs, WearPrepaidCardDetailIntentArgs wearPrepaidCardDetailIntentArgs, WearMfiAcquireUserConsentIntentArgs wearMfiAcquireUserConsentIntentArgs) {
        this.a = account;
        this.b = str;
        this.c = j;
        this.d = intentSource;
        this.e = fopDetailIntentArgs;
        this.f = transactionDetailIntentArgs;
        this.g = transactionListIntentArgs;
        this.h = closedLoopCardIntentArgs;
        this.i = transitDisplayCardIntentArgs;
        this.j = saveTicketCentricIntentArgs;
        this.k = paycacheSetupIntentArgs;
        this.l = topUpIntentArgs;
        this.m = valuableDetailIntentArgs;
        this.n = homeIntentArgs;
        this.o = valuableSaveIntentArgs;
        this.p = addLoyaltyCardIntentArgs;
        this.q = autoloadSettingsIntentArgs;
        this.r = lowBalanceNotificationSettingsIntentArgs;
        this.s = sePrepaidCardDetailIntentArgs;
        this.t = sePrepaidMfiCardDetailIntentArgs;
        this.u = provisionSePrepaidCardIntentArgs;
        this.v = walletFrameworkIntentArgs;
        this.w = selectPurchasablePassIntentArgs;
        this.x = wearCardManagementIntentArgs;
        this.y = wearClosedLoopCardIntentArgs;
        this.z = addPaymentMethodIntentArgs;
        this.A = wearSuicaCardDetailIntentArgs;
        this.B = wearTransactionListIntentArgs;
        this.C = secureElementPrepaidTosIntentArgs;
        this.D = seCommuterPassDetailIntentArgs;
        this.E = managedSecureElementWalletIntentArgs;
        this.F = driversLicenseIntentArgs;
        this.G = bArr;
        this.H = addBankAccountIntentArgs;
        this.I = fopListIntentArgs;
        this.J = suwAddPaymentMethodIntentArgs;
        this.K = viewValuableSearchLoyaltyCardProgramIntentArgs;
        this.L = mdocIntentArgs;
        this.M = enterUserCreatedPassIntentArgs;
        this.N = createOrUpdateUserCreatedPassIntentArgs;
        this.O = wearPrepaidCardDetailIntentArgs;
        this.P = wearMfiAcquireUserConsentIntentArgs;
    }
}
