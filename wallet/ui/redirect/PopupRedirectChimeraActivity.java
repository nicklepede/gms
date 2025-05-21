package com.google.android.gms.wallet.ui.redirect;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.a;
import defpackage.difg;
import defpackage.dimk;
import defpackage.ding;
import defpackage.djig;
import defpackage.djip;
import defpackage.efdk;
import defpackage.efon;
import defpackage.efts;
import defpackage.efzv;
import defpackage.efzx;
import defpackage.ehpm;
import defpackage.ehvz;
import defpackage.ehwa;
import defpackage.ehwq;
import defpackage.feay;
import defpackage.fecj;
import defpackage.feen;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PopupRedirectChimeraActivity extends efzv implements difg, efts {
    public static final /* synthetic */ int a = 0;
    private Account c;
    private BuyFlowConfig d;

    public static Intent e(Context context, ehvz ehvzVar, ArrayList arrayList, String str, int i, byte[] bArr, LogContext logContext, BuyFlowConfig buyFlowConfig, Account account) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), efzv.class.getName());
        Bundle bundle = new Bundle();
        efdk.j(bundle, "formProto", ehvzVar);
        efdk.l(bundle, "successfullyValidatedApps", arrayList);
        bundle.putParcelable("parentLogContext", logContext);
        intent.putExtra("parcelableBundle", bundle);
        intent.putExtra("title", str);
        intent.putExtra("activityThemeResId", i);
        intent.putExtra("formThemeResId", R.style.WalletEmptyStyle);
        intent.putExtra("logToken", bArr);
        intent.setClassName(context, "com.google.android.gms.wallet.ui.redirect.PopupRedirectProxyActivity");
        Bundle bundleExtra = intent.getBundleExtra("parcelableBundle");
        bundleExtra.putParcelable("buyFlowConfig", buyFlowConfig);
        intent.putExtra("parcelableBundle", bundleExtra);
        intent.putExtra("account", account);
        return intent;
    }

    @Override // defpackage.pob
    public final void d(Toolbar toolbar) {
        super.d(toolbar);
        if (ding.Q(l())) {
            kJ().o(true);
            dimk.e(toolbar, this, l());
        } else {
            if (toolbar == null || toolbar.e() == null) {
                return;
            }
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{R.attr.colorWalletActionBarForeground});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color == 0 || toolbar.e() == null) {
                return;
            }
            toolbar.e().setTint(color);
        }
    }

    @Override // defpackage.efts
    public final int f() {
        BuyFlowConfig l = l();
        if (l != null) {
            return l.b.a;
        }
        return 0;
    }

    @Override // defpackage.efzv
    protected final void i() {
        ding.C(this, l(), ding.k, true);
    }

    @Override // defpackage.efzv
    protected final efzx k(ehvz ehvzVar, ArrayList arrayList, int i, LogContext logContext) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getIntent().getBundleExtra("parcelableBundle").getParcelable("buyFlowConfig");
        ehwq ehwqVar = (ehwq) efdk.b(getIntent(), "webViewComponent", (feen) ehwq.a.iB(7, null));
        if (ehwqVar == null) {
            djig djigVar = new djig();
            Bundle A = djig.A(ehvzVar, arrayList, i, logContext);
            A.putParcelable("buyFlowConfig", buyFlowConfig);
            djigVar.setArguments(A);
            return djigVar;
        }
        djip djipVar = new djip();
        ehvz ehvzVar2 = ehwqVar.b;
        if (ehvzVar2 == null) {
            ehvzVar2 = ehvz.a;
        }
        djipVar.setArguments(djip.A(ehvzVar2, null, i, logContext));
        return djipVar;
    }

    @Override // defpackage.edmf
    public final Account kW() {
        if (this.c == null) {
            this.c = (Account) getIntent().getParcelableExtra("account");
        }
        return this.c;
    }

    @Override // defpackage.difg
    public final BuyFlowConfig l() {
        if (this.d == null) {
            this.d = (BuyFlowConfig) getIntent().getBundleExtra("parcelableBundle").getParcelable("buyFlowConfig");
        }
        return this.d;
    }

    @Override // defpackage.efzv, defpackage.efud
    public final void x(int i, Bundle bundle) {
        if (i == 23) {
            Intent intent = new Intent();
            intent.putExtra("webViewComponentCallbackData", bundle);
            setResult(-1, intent);
            finish();
            return;
        }
        if (i == 24) {
            Intent intent2 = new Intent();
            intent2.putExtra("webViewComponentErrorDetails", bundle);
            setResult(100, intent2);
            finish();
            return;
        }
        if (i != 1) {
            if (i == 10) {
                setResult(2);
                finish();
                return;
            }
            if (i != 4) {
                if (i == 5) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("errorDetails", bundle);
                    setResult(1, intent3);
                    finish();
                    return;
                }
                if (i != 7) {
                    if (i != 8) {
                        throw new IllegalArgumentException(a.j(i, "Unsupported formEvent: "));
                    }
                    if (((efzv) this).b.kb()) {
                        Intent intent4 = new Intent();
                        efzx efzxVar = ((efzv) this).b;
                        fecj v = ehwa.a.v();
                        ehpm ehpmVar = ((ehvz) efzxVar.y).c;
                        if (ehpmVar == null) {
                            ehpmVar = ehpm.a;
                        }
                        if ((ehpmVar.b & 1) != 0) {
                            ehpm ehpmVar2 = ((ehvz) efzxVar.y).c;
                            if (ehpmVar2 == null) {
                                ehpmVar2 = ehpm.a;
                            }
                            String str = ehpmVar2.c;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ehwa ehwaVar = (ehwa) v.b;
                            str.getClass();
                            ehwaVar.b |= 1;
                            ehwaVar.e = str;
                        }
                        ehpm ehpmVar3 = ((ehvz) efzxVar.y).c;
                        if (((ehpmVar3 == null ? ehpm.a : ehpmVar3).b & 4) != 0) {
                            if (ehpmVar3 == null) {
                                ehpmVar3 = ehpm.a;
                            }
                            feay feayVar = ehpmVar3.e;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ehwa ehwaVar2 = (ehwa) v.b;
                            feayVar.getClass();
                            ehwaVar2.b = 2 | ehwaVar2.b;
                            ehwaVar2.f = feayVar;
                        }
                        if (efzxVar.K()) {
                            String str2 = efzxVar.g;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ehwa ehwaVar3 = (ehwa) v.b;
                            str2.getClass();
                            ehwaVar3.c = 3;
                            ehwaVar3.d = str2;
                        } else if (efzxVar.T()) {
                            String str3 = efzxVar.f;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ehwa ehwaVar4 = (ehwa) v.b;
                            str3.getClass();
                            ehwaVar4.c = 4;
                            ehwaVar4.d = str3;
                        } else if (efzxVar.J()) {
                            String str4 = efzxVar.i;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ehwa ehwaVar5 = (ehwa) v.b;
                            str4.getClass();
                            ehwaVar5.b |= 32;
                            ehwaVar5.j = str4;
                        } else {
                            if (!efzxVar.j) {
                                throw new IllegalStateException("Unknown RedirectFormValue state.");
                            }
                            if (!v.b.L()) {
                                v.U();
                            }
                            ehwa ehwaVar6 = (ehwa) v.b;
                            ehwaVar6.b |= 16;
                            ehwaVar6.i = true;
                        }
                        efon efonVar = efzxVar.h;
                        if (efonVar != null && efonVar.b()) {
                            String a2 = efzxVar.h.a();
                            if (!v.b.L()) {
                                v.U();
                            }
                            ehwa ehwaVar7 = (ehwa) v.b;
                            a2.getClass();
                            ehwaVar7.b = 4 | ehwaVar7.b;
                            ehwaVar7.g = a2;
                        }
                        efdk.k(intent4, "formValue", (ehwa) v.Q());
                        setResult(-1, intent4);
                        finish();
                    }
                }
            }
        }
    }
}
