package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PayIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmx();
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
            if (atyq.b(this.a, payIntentArgs.a) && atyq.b(this.b, payIntentArgs.b) && atyq.b(Long.valueOf(this.c), Long.valueOf(payIntentArgs.c)) && atyq.b(this.d, payIntentArgs.d) && atyq.b(this.e, payIntentArgs.e) && atyq.b(this.f, payIntentArgs.f) && atyq.b(this.g, payIntentArgs.g) && atyq.b(this.h, payIntentArgs.h) && atyq.b(this.i, payIntentArgs.i) && atyq.b(this.j, payIntentArgs.j) && atyq.b(this.k, payIntentArgs.k) && atyq.b(this.l, payIntentArgs.l) && atyq.b(this.m, payIntentArgs.m) && atyq.b(this.n, payIntentArgs.n) && atyq.b(this.o, payIntentArgs.o) && atyq.b(this.p, payIntentArgs.p) && atyq.b(this.q, payIntentArgs.q) && atyq.b(this.r, payIntentArgs.r) && atyq.b(this.s, payIntentArgs.s) && atyq.b(this.t, payIntentArgs.t) && atyq.b(this.u, payIntentArgs.u) && atyq.b(this.v, payIntentArgs.v) && atyq.b(this.w, payIntentArgs.w) && atyq.b(this.x, payIntentArgs.x) && atyq.b(this.y, payIntentArgs.y) && atyq.b(this.z, payIntentArgs.z) && atyq.b(this.A, payIntentArgs.A) && atyq.b(this.B, payIntentArgs.B) && atyq.b(this.C, payIntentArgs.C) && atyq.b(this.D, payIntentArgs.D) && atyq.b(this.E, payIntentArgs.E) && atyq.b(this.F, payIntentArgs.F) && Arrays.equals(this.G, payIntentArgs.G) && atyq.b(this.H, payIntentArgs.H) && atyq.b(this.I, payIntentArgs.I) && atyq.b(this.J, payIntentArgs.J) && atyq.b(this.K, payIntentArgs.K) && atyq.b(this.L, payIntentArgs.L) && atyq.b(this.M, payIntentArgs.M) && atyq.b(this.N, payIntentArgs.N) && atyq.b(this.O, payIntentArgs.O) && atyq.b(this.P, payIntentArgs.P)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.e, i, false);
        atzr.t(parcel, 3, this.f, i, false);
        atzr.t(parcel, 4, this.g, i, false);
        atzr.t(parcel, 5, this.h, i, false);
        atzr.t(parcel, 6, this.i, i, false);
        atzr.t(parcel, 7, this.j, i, false);
        atzr.t(parcel, 8, this.k, i, false);
        atzr.t(parcel, 9, this.l, i, false);
        atzr.t(parcel, 10, this.m, i, false);
        atzr.t(parcel, 11, this.n, i, false);
        atzr.t(parcel, 12, this.o, i, false);
        atzr.t(parcel, 13, this.p, i, false);
        atzr.t(parcel, 14, this.q, i, false);
        atzr.t(parcel, 15, this.r, i, false);
        atzr.t(parcel, 16, this.s, i, false);
        atzr.t(parcel, 17, this.d, i, false);
        atzr.t(parcel, 18, this.v, i, false);
        atzr.t(parcel, 21, this.w, i, false);
        atzr.t(parcel, 22, this.x, i, false);
        atzr.v(parcel, 24, this.b, false);
        atzr.q(parcel, 25, this.c);
        atzr.t(parcel, 26, this.y, i, false);
        atzr.t(parcel, 27, this.z, i, false);
        atzr.t(parcel, 28, this.A, i, false);
        atzr.t(parcel, 29, this.B, i, false);
        atzr.t(parcel, 31, this.C, i, false);
        atzr.t(parcel, 33, this.D, i, false);
        atzr.t(parcel, 34, this.E, i, false);
        atzr.t(parcel, 35, this.F, i, false);
        atzr.t(parcel, 36, this.t, i, false);
        atzr.t(parcel, 37, this.u, i, false);
        atzr.i(parcel, 38, this.G, false);
        atzr.t(parcel, 39, this.H, i, false);
        atzr.t(parcel, 40, this.I, i, false);
        atzr.t(parcel, 41, this.J, i, false);
        atzr.t(parcel, 42, this.K, i, false);
        atzr.t(parcel, 43, this.L, i, false);
        atzr.t(parcel, 44, this.M, i, false);
        atzr.t(parcel, 45, this.N, i, false);
        atzr.t(parcel, 46, this.O, i, false);
        atzr.t(parcel, 47, this.P, i, false);
        atzr.c(parcel, a);
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
