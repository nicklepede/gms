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
import defpackage.dkqr;
import defpackage.dkxv;
import defpackage.dkyr;
import defpackage.dltz;
import defpackage.dlui;
import defpackage.ehqn;
import defpackage.eibq;
import defpackage.eigv;
import defpackage.eimy;
import defpackage.eina;
import defpackage.ekcs;
import defpackage.ekjf;
import defpackage.ekjg;
import defpackage.ekjw;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fgtg;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PopupRedirectChimeraActivity extends eimy implements dkqr, eigv {
    public static final /* synthetic */ int a = 0;
    private Account c;
    private BuyFlowConfig d;

    public static Intent e(Context context, ekjf ekjfVar, ArrayList arrayList, String str, int i, byte[] bArr, LogContext logContext, BuyFlowConfig buyFlowConfig, Account account) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), eimy.class.getName());
        Bundle bundle = new Bundle();
        ehqn.j(bundle, "formProto", ekjfVar);
        ehqn.l(bundle, "successfullyValidatedApps", arrayList);
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

    @Override // defpackage.rhf
    public final void d(Toolbar toolbar) {
        super.d(toolbar);
        if (dkyr.Q(l())) {
            kY().o(true);
            dkxv.e(toolbar, this, l());
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

    @Override // defpackage.eigv
    public final int f() {
        BuyFlowConfig l = l();
        if (l != null) {
            return l.b.a;
        }
        return 0;
    }

    @Override // defpackage.eimy
    protected final void i() {
        dkyr.C(this, l(), dkyr.k, true);
    }

    @Override // defpackage.eimy
    protected final eina k(ekjf ekjfVar, ArrayList arrayList, int i, LogContext logContext) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getIntent().getBundleExtra("parcelableBundle").getParcelable("buyFlowConfig");
        ekjw ekjwVar = (ekjw) ehqn.b(getIntent(), "webViewComponent", (fgtg) ekjw.a.iQ(7, null));
        if (ekjwVar == null) {
            dltz dltzVar = new dltz();
            Bundle A = dltz.A(ekjfVar, arrayList, i, logContext);
            A.putParcelable("buyFlowConfig", buyFlowConfig);
            dltzVar.setArguments(A);
            return dltzVar;
        }
        dlui dluiVar = new dlui();
        ekjf ekjfVar2 = ekjwVar.b;
        if (ekjfVar2 == null) {
            ekjfVar2 = ekjf.a;
        }
        dluiVar.setArguments(dlui.A(ekjfVar2, null, i, logContext));
        return dluiVar;
    }

    @Override // defpackage.dkqr
    public final BuyFlowConfig l() {
        if (this.d == null) {
            this.d = (BuyFlowConfig) getIntent().getBundleExtra("parcelableBundle").getParcelable("buyFlowConfig");
        }
        return this.d;
    }

    @Override // defpackage.efzb
    public final Account ll() {
        if (this.c == null) {
            this.c = (Account) getIntent().getParcelableExtra("account");
        }
        return this.c;
    }

    @Override // defpackage.eimy, defpackage.eihg
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
                    if (((eimy) this).b.kq()) {
                        Intent intent4 = new Intent();
                        eina einaVar = ((eimy) this).b;
                        fgrc v = ekjg.a.v();
                        ekcs ekcsVar = ((ekjf) einaVar.y).c;
                        if (ekcsVar == null) {
                            ekcsVar = ekcs.a;
                        }
                        if ((ekcsVar.b & 1) != 0) {
                            ekcs ekcsVar2 = ((ekjf) einaVar.y).c;
                            if (ekcsVar2 == null) {
                                ekcsVar2 = ekcs.a;
                            }
                            String str = ekcsVar2.c;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ekjg ekjgVar = (ekjg) v.b;
                            str.getClass();
                            ekjgVar.b |= 1;
                            ekjgVar.e = str;
                        }
                        ekcs ekcsVar3 = ((ekjf) einaVar.y).c;
                        if (((ekcsVar3 == null ? ekcs.a : ekcsVar3).b & 4) != 0) {
                            if (ekcsVar3 == null) {
                                ekcsVar3 = ekcs.a;
                            }
                            fgpr fgprVar = ekcsVar3.e;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ekjg ekjgVar2 = (ekjg) v.b;
                            fgprVar.getClass();
                            ekjgVar2.b = 2 | ekjgVar2.b;
                            ekjgVar2.f = fgprVar;
                        }
                        if (einaVar.K()) {
                            String str2 = einaVar.g;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ekjg ekjgVar3 = (ekjg) v.b;
                            str2.getClass();
                            ekjgVar3.c = 3;
                            ekjgVar3.d = str2;
                        } else if (einaVar.T()) {
                            String str3 = einaVar.f;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ekjg ekjgVar4 = (ekjg) v.b;
                            str3.getClass();
                            ekjgVar4.c = 4;
                            ekjgVar4.d = str3;
                        } else if (einaVar.J()) {
                            String str4 = einaVar.i;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ekjg ekjgVar5 = (ekjg) v.b;
                            str4.getClass();
                            ekjgVar5.b |= 32;
                            ekjgVar5.j = str4;
                        } else {
                            if (!einaVar.j) {
                                throw new IllegalStateException("Unknown RedirectFormValue state.");
                            }
                            if (!v.b.L()) {
                                v.U();
                            }
                            ekjg ekjgVar6 = (ekjg) v.b;
                            ekjgVar6.b |= 16;
                            ekjgVar6.i = true;
                        }
                        eibq eibqVar = einaVar.h;
                        if (eibqVar != null && eibqVar.b()) {
                            String a2 = einaVar.h.a();
                            if (!v.b.L()) {
                                v.U();
                            }
                            ekjg ekjgVar7 = (ekjg) v.b;
                            a2.getClass();
                            ekjgVar7.b = 4 | ekjgVar7.b;
                            ekjgVar7.g = a2;
                        }
                        ehqn.k(intent4, "formValue", (ekjg) v.Q());
                        setResult(-1, intent4);
                        finish();
                    }
                }
            }
        }
    }
}
