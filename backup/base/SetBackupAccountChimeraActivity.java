package com.google.android.gms.backup.base;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.backup.base.SetBackupAccountChimeraActivity;
import com.google.android.gms.backup.common.util.session.ParcelableSession;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.ahlj;
import defpackage.ahlp;
import defpackage.ahlt;
import defpackage.ahlu;
import defpackage.ahml;
import defpackage.ahmm;
import defpackage.ahrf;
import defpackage.ahsw;
import defpackage.ahtc;
import defpackage.ahwd;
import defpackage.ahwj;
import defpackage.ahwm;
import defpackage.ahws;
import defpackage.aicy;
import defpackage.aidc;
import defpackage.aiee;
import defpackage.aiey;
import defpackage.arxo;
import defpackage.asiu;
import defpackage.asmf;
import defpackage.asoe;
import defpackage.bp;
import defpackage.bqna;
import defpackage.dezt;
import defpackage.dfae;
import defpackage.dfah;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dwae;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eitj;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.ekib;
import defpackage.esiu;
import defpackage.esiw;
import defpackage.eswh;
import defpackage.eswi;
import defpackage.eswt;
import defpackage.eswu;
import defpackage.eswz;
import defpackage.esxa;
import defpackage.esxb;
import defpackage.esxo;
import defpackage.esxp;
import defpackage.esyj;
import defpackage.esyk;
import defpackage.esyo;
import defpackage.esys;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.ffbn;
import defpackage.qfp;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SetBackupAccountChimeraActivity extends qfp implements ahlt {
    public static final ahwd j = new ahwd("SetBackupAccountChimeraActivity");
    public aiey m;
    public final AtomicReference k = new AtomicReference();
    public Account[] l = null;
    private final eijr n = eijy.a(new eijr() { // from class: ahmg
        @Override // defpackage.eijr
        public final Object a() {
            return new aiee(SetBackupAccountChimeraActivity.this);
        }
    });
    private final AccountManagerCallback o = new AccountManagerCallback() { // from class: ahmh
        @Override // android.accounts.AccountManagerCallback
        public final void run(AccountManagerFuture accountManagerFuture) {
            SetBackupAccountChimeraActivity.this.f(accountManagerFuture);
        }
    };

    private final ahlp k() {
        ahwm ahwmVar = new ahwm(this, new asmf(3, 9));
        aiee aieeVar = (aiee) this.n.a();
        asmf asmfVar = new asmf(3, 9);
        arxo arxoVar = ahsw.a;
        return new ahlp(this, new ahsw(this, asmfVar, new aiee(this), eitj.l(new ahtc(this))), ahwmVar, aieeVar);
    }

    private final void l() {
        if (isFinishing() || !aidc.a(this).isEmpty()) {
            return;
        }
        setResult(0);
        finish();
    }

    private final boolean m() {
        return getIntent().getBooleanExtra("showConfirmationDialogOnAccountChange", false);
    }

    @Override // defpackage.ahlt
    public final void a(Account account) {
        ahlp k = k();
        int b = k.b(account);
        fecj v = ekib.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ekib ekibVar = (ekib) fecpVar;
        ekibVar.c = 2;
        ekibVar.b |= 1;
        if (!fecpVar.L()) {
            v.U();
        }
        ekib ekibVar2 = (ekib) v.b;
        ekibVar2.d = b - 1;
        ekibVar2.b |= 2;
        ekib ekibVar3 = (ekib) v.Q();
        fecj c = ahwj.c();
        if (!c.b.L()) {
            c.U();
        }
        aiee aieeVar = k.e;
        ekhl ekhlVar = (ekhl) c.b;
        ekhl ekhlVar2 = ekhl.a;
        ekibVar3.getClass();
        ekhlVar.at = ekibVar3;
        ekhlVar.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        aieeVar.z(c, ekhk.BACKUP_ACCOUNT_CHANGE_EVENT, 0);
        finish();
    }

    @Override // defpackage.ahlt
    public final void b(final Account account) {
        final ahlp k = k();
        SetBackupAccountChimeraActivity setBackupAccountChimeraActivity = k.b;
        View findViewById = setBackupAccountChimeraActivity.findViewById(R.id.set_backup_account_root);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        bp bpVar = new bp(setBackupAccountChimeraActivity.getSupportFragmentManager());
        bpVar.E(ahlj.class, ahlj.class.getName());
        bpVar.d();
        Account account2 = (Account) setBackupAccountChimeraActivity.getIntent().getParcelableExtra("currentBackupAccount");
        if (account2 == null) {
            ahlp.a.g("Null value for current backup account", new IllegalStateException("Current backup account is null"), new Object[0]);
            return;
        }
        String stringExtra = setBackupAccountChimeraActivity.getIntent().getStringExtra("photosBackupAccountName");
        String str = account.name;
        setBackupAccountChimeraActivity.getIntent().getStringExtra("photosBackupAccountName");
        fecj v = esys.a.v();
        esiu esiuVar = esiu.M;
        if (!v.b.L()) {
            v.U();
        }
        esys esysVar = (esys) v.b;
        esysVar.c = esiuVar.a();
        esysVar.b |= 1;
        fecj v2 = eswh.a.v();
        eswt eswtVar = (eswt) eswu.a.v();
        eswtVar.k(R.string.change_backup_account_dialog_title);
        if (!v2.b.L()) {
            v2.U();
        }
        eswh eswhVar = (eswh) v2.b;
        eswu eswuVar = (eswu) eswtVar.Q();
        eswuVar.getClass();
        eswhVar.d = eswuVar;
        eswhVar.b |= 2;
        eswu eswuVar2 = eswu.a;
        eswt eswtVar2 = (eswt) eswuVar2.v();
        eswtVar2.k(R.string.common_confirm);
        if (!v2.b.L()) {
            v2.U();
        }
        eswh eswhVar2 = (eswh) v2.b;
        eswu eswuVar3 = (eswu) eswtVar2.Q();
        eswuVar3.getClass();
        eswhVar2.f = eswuVar3;
        eswhVar2.b |= 8;
        eswt eswtVar3 = (eswt) eswuVar2.v();
        eswtVar3.k(R.string.common_cancel);
        if (!v2.b.L()) {
            v2.U();
        }
        eswh eswhVar3 = (eswh) v2.b;
        eswu eswuVar4 = (eswu) eswtVar3.Q();
        eswuVar4.getClass();
        eswhVar3.g = eswuVar4;
        eswhVar3.b |= 16;
        eswt eswtVar4 = (eswt) eswuVar2.v();
        eswtVar4.k(R.string.change_backup_account_dialog_text_for_other_device_data);
        boolean z = stringExtra == null;
        if (stringExtra != null) {
            if (stringExtra.equals(str)) {
                eswtVar4.k(R.string.change_backup_account_dialog_text_for_photos_same_account);
            } else {
                eswtVar4.k(R.string.change_backup_account_dialog_text_for_photos);
            }
        }
        if (((Boolean) k.f.a()).booleanValue()) {
            eswtVar4.k(R.string.change_backup_account_dialog_text_for_android_messages);
        }
        if (!v2.b.L()) {
            v2.U();
        }
        eswh eswhVar4 = (eswh) v2.b;
        eswu eswuVar5 = (eswu) eswtVar4.Q();
        eswuVar5.getClass();
        eswhVar4.e = eswuVar5;
        eswhVar4.b |= 4;
        fecj v3 = esyo.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        esyo esyoVar = (esyo) v3.b;
        eswh eswhVar5 = (eswh) v2.Q();
        eswhVar5.getClass();
        esyoVar.e = eswhVar5;
        esyoVar.b |= 1;
        esyo esyoVar2 = (esyo) v3.Q();
        if (!v.b.L()) {
            v.U();
        }
        esys esysVar2 = (esys) v.b;
        esyoVar2.getClass();
        esysVar2.d = esyoVar2;
        esysVar2.b |= 8;
        esys esysVar3 = (esys) v.Q();
        esyj esyjVar = (esyj) esyk.a.v();
        esyjVar.a(12);
        esyk esykVar = (esyk) esyjVar.Q();
        fecj v4 = eswi.a.v();
        if (!v4.b.L()) {
            v4.U();
        }
        boolean z2 = !z;
        fecp fecpVar = v4.b;
        eswi eswiVar = (eswi) fecpVar;
        eswiVar.b |= 2;
        eswiVar.d = z2;
        if (!fecpVar.L()) {
            v4.U();
        }
        eswi eswiVar2 = (eswi) v4.b;
        eswiVar2.b |= 1;
        eswiVar2.c = true;
        eswi eswiVar3 = (eswi) v4.Q();
        fecj v5 = esxp.a.v();
        if (!v5.b.L()) {
            v5.U();
        }
        fecp fecpVar2 = v5.b;
        esxp esxpVar = (esxp) fecpVar2;
        esykVar.getClass();
        esxpVar.t = esykVar;
        esxpVar.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        if (!fecpVar2.L()) {
            v5.U();
        }
        esxp esxpVar2 = (esxp) v5.b;
        eswiVar3.getClass();
        esxpVar2.f = eswiVar3;
        esxpVar2.b |= 1;
        esxp esxpVar3 = (esxp) v5.Q();
        fecj v6 = esxo.a.v();
        esiw esiwVar = esiw.ANDROID_BACKUP_SET_ACCOUNT;
        if (!v6.b.L()) {
            v6.U();
        }
        fecp fecpVar3 = v6.b;
        esxo esxoVar = (esxo) fecpVar3;
        esxoVar.c = esiwVar.lF;
        esxoVar.b |= 1;
        if (!fecpVar3.L()) {
            v6.U();
        }
        esxo esxoVar2 = (esxo) v6.b;
        esxpVar3.getClass();
        esxoVar2.d = esxpVar3;
        esxoVar2.b |= 2;
        esxo esxoVar3 = (esxo) v6.Q();
        final esxb c = ParcelableSession.b().c();
        ahwm ahwmVar = k.d;
        final String str2 = account2.name;
        String str3 = account.name;
        arxo arxoVar = ahwm.a;
        arxoVar.j("record account switching consent", new Object[0]);
        final eswz eswzVar = (eswz) esxa.a.v();
        if (!eswzVar.b.L()) {
            eswzVar.U();
        }
        esxa esxaVar = (esxa) eswzVar.b;
        esxoVar3.getClass();
        esxaVar.f = esxoVar3;
        esxaVar.b |= 4;
        if (!eswzVar.b.L()) {
            eswzVar.U();
        }
        esxa esxaVar2 = (esxa) eswzVar.b;
        esysVar3.getClass();
        esxaVar2.g = esysVar3;
        esxaVar2.b |= 8;
        arxoVar.j(((esxa) eswzVar.Q()).toString(), new Object[0]);
        final Context context = ahwmVar.e;
        Executor executor = ahwmVar.d;
        final dfaq b = ahws.b(context, str2);
        final dfaq b2 = ahws.b(context, str3);
        dfaq e = dfbl.h(b, b2).e(executor, new dezt() { // from class: ahwq
            @Override // defpackage.dezt
            public final Object a(dfaq dfaqVar) {
                int i = ahws.a;
                dfaq dfaqVar2 = dfaq.this;
                String str4 = dfaqVar2.m() ? (String) dfaqVar2.i() : null;
                dfaq dfaqVar3 = b2;
                String str5 = dfaqVar3.m() ? (String) dfaqVar3.i() : null;
                eswz eswzVar2 = eswzVar;
                if (str4 != null) {
                    fecj v7 = esxi.a.v();
                    if (!v7.b.L()) {
                        v7.U();
                    }
                    esxi esxiVar = (esxi) v7.b;
                    esxiVar.b = 1;
                    esxiVar.c = str4;
                    esxi esxiVar2 = (esxi) v7.Q();
                    fecj v8 = esxl.a.v();
                    if (!v8.b.L()) {
                        v8.U();
                    }
                    esxl esxlVar = (esxl) v8.b;
                    esxiVar2.getClass();
                    esxlVar.c = esxiVar2;
                    esxlVar.b |= 1;
                    esxl esxlVar2 = (esxl) v8.Q();
                    if (!eswzVar2.b.L()) {
                        eswzVar2.U();
                    }
                    esxa esxaVar3 = (esxa) eswzVar2.b;
                    esxa esxaVar4 = esxa.a;
                    esxlVar2.getClass();
                    esxaVar3.d = esxlVar2;
                    esxaVar3.b |= 1;
                }
                if (str5 != null) {
                    fecj v9 = esxi.a.v();
                    if (!v9.b.L()) {
                        v9.U();
                    }
                    esxi esxiVar3 = (esxi) v9.b;
                    esxiVar3.b = 1;
                    esxiVar3.c = str5;
                    esxi esxiVar4 = (esxi) v9.Q();
                    fecj v10 = esxl.a.v();
                    esxh f = ahws.f();
                    if (!v10.b.L()) {
                        v10.U();
                    }
                    fecp fecpVar4 = v10.b;
                    esxl esxlVar3 = (esxl) fecpVar4;
                    f.getClass();
                    esxlVar3.d = f;
                    esxlVar3.b |= 4;
                    if (!fecpVar4.L()) {
                        v10.U();
                    }
                    esxl esxlVar4 = (esxl) v10.b;
                    esxiVar4.getClass();
                    esxlVar4.c = esxiVar4;
                    esxlVar4.b |= 1;
                    esxl esxlVar5 = (esxl) v10.Q();
                    if (!eswzVar2.b.L()) {
                        eswzVar2.U();
                    }
                    esxa esxaVar5 = (esxa) eswzVar2.b;
                    esxa esxaVar6 = esxa.a;
                    esxlVar5.getClass();
                    esxaVar5.e = esxlVar5;
                    esxaVar5.b |= 2;
                }
                return ahws.e(context, eswzVar2, str2, c);
            }
        });
        e.y(new dfah() { // from class: ahwl
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                ahwm.a.g("Exception writing audit record for account switching", exc, new Object[0]);
            }
        });
        e.x(new dfae() { // from class: ahln
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                ahlp ahlpVar = ahlp.this;
                Account account3 = account;
                ahlo ahloVar = new ahlo(ahlpVar, account3);
                aiaa a = aiab.a();
                a.c(15);
                ahlpVar.c.d(account3, ahloVar, null, a.a());
            }
        });
    }

    public final void c() {
        bqna.b(this).s(true != asoe.c(this) ? "com.google" : "cn.google", null, getContainerActivity(), this.o, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void f(android.accounts.AccountManagerFuture r7) {
        /*
            r6 = this;
            java.lang.String r0 = "authAccount"
            r1 = 2
            r2 = 0
            java.lang.Object r7 = r7.getResult()     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            ahwd r3 = com.google.android.gms.backup.base.SetBackupAccountChimeraActivity.j     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            boolean r4 = r3.b(r1)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            if (r4 == 0) goto L1d
            java.lang.String r4 = "account added: "
            java.lang.String r4 = defpackage.a.L(r7, r4)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            r3.j(r4, r5)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
        L1d:
            boolean r4 = r7.containsKey(r0)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            if (r4 == 0) goto L54
            java.lang.Object r0 = r7.get(r0)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            java.lang.String r4 = "accountType"
            java.lang.Object r7 = r7.get(r4)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            boolean r4 = r6.m()     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            if (r4 == 0) goto L45
            android.accounts.Account r3 = new android.accounts.Account     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            r3.<init>(r0, r7)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            ahme r7 = new ahme     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            r7.<init>()     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            r6.runOnUiThread(r7)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            return
        L45:
            java.lang.String r4 = "#accountManagerCallback saving account in preference and finishing"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            r3.d(r4, r5)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            android.accounts.Account r3 = new android.accounts.Account     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            r3.<init>(r0, r7)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            r6.g(r3)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
        L54:
            r7 = -1
            r6.setResult(r7)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            return
        L59:
            r7 = move-exception
            goto L5c
        L5b:
            r7 = move-exception
        L5c:
            ahwd r0 = com.google.android.gms.backup.base.SetBackupAccountChimeraActivity.j
            boolean r1 = r0.b(r1)
            if (r1 == 0) goto L6b
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "addAccount failed: "
            r0.k(r2, r7, r1)
        L6b:
            r6.l()
            return
        L6f:
            ahwd r7 = com.google.android.gms.backup.base.SetBackupAccountChimeraActivity.j
            boolean r0 = r7.b(r1)
            if (r0 == 0) goto L7e
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "addAccount was canceled."
            r7.j(r1, r0)
        L7e:
            r6.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.base.SetBackupAccountChimeraActivity.f(android.accounts.AccountManagerFuture):void");
    }

    public final void g(Account account) {
        if (ahrf.a()) {
            if (account.equals((Account) getIntent().getParcelableExtra("currentBackupAccount"))) {
                finish();
                return;
            }
            if (getIntent().getBooleanExtra("returnBackupAccountWithIntent", false)) {
                setResult(-1, new Intent().putExtra("account", account));
                finish();
                return;
            }
            if (m()) {
                j.d("#startSetBackupAccountFlow Displaying account change confirmation dialog", new Object[0]);
                h(account);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("account", account);
            if (ahrf.a()) {
                intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.EnhancedBackupOptInActivity");
                dwae.d(intent, ffbn.OTHER_BACKUP_SETTINGS);
                dwae.d(intent, ffbn.BACKUP_SETTINGS_ACCOUNT_CHANGE);
            } else {
                intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.SetBackupAccountFlowActivity");
                intent.putExtra("turnOff", getIntent().getBooleanExtra("turnOff", false));
                intent.putExtra("showDone", getIntent().getBooleanExtra("showDone", false));
            }
            startActivity(intent);
            finish();
            return;
        }
        eswz eswzVar = (eswz) esxa.a.v();
        fecj v = esxo.a.v();
        esiw esiwVar = esiw.ANDROID_BACKUP_SET_ACCOUNT;
        if (!v.b.L()) {
            v.U();
        }
        esxo esxoVar = (esxo) v.b;
        esxoVar.c = esiwVar.lF;
        esxoVar.b |= 1;
        esyj esyjVar = (esyj) esyk.a.v();
        esyjVar.a(12);
        esyk esykVar = (esyk) esyjVar.Q();
        fecj v2 = esxp.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        esxp esxpVar = (esxp) v2.b;
        esykVar.getClass();
        esxpVar.t = esykVar;
        esxpVar.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        esxp esxpVar2 = (esxp) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        esxo esxoVar2 = (esxo) v.b;
        esxpVar2.getClass();
        esxoVar2.d = esxpVar2;
        esxoVar2.b |= 2;
        if (!eswzVar.b.L()) {
            eswzVar.U();
        }
        esxa esxaVar = (esxa) eswzVar.b;
        esxo esxoVar3 = (esxo) v.Q();
        esxoVar3.getClass();
        esxaVar.f = esxoVar3;
        esxaVar.b |= 4;
        fecj v3 = esys.a.v();
        esiu esiuVar = esiu.W;
        if (!v3.b.L()) {
            v3.U();
        }
        esys esysVar = (esys) v3.b;
        esysVar.c = esiuVar.a();
        esysVar.b |= 1;
        if (!eswzVar.b.L()) {
            eswzVar.U();
        }
        esxa esxaVar2 = (esxa) eswzVar.b;
        esys esysVar2 = (esys) v3.Q();
        esysVar2.getClass();
        esxaVar2.g = esysVar2;
        esxaVar2.b |= 8;
        ahws.c(getApplicationContext(), eswzVar, account).x(new dfae() { // from class: ahmf
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                ahwd ahwdVar = SetBackupAccountChimeraActivity.j;
                if (dfaqVar.m()) {
                    return;
                }
                SetBackupAccountChimeraActivity.j.g("Exception writing audit record", dfaqVar.h(), new Object[0]);
            }
        });
        if (asiu.a().d(this, new Intent().setClassName(this, "com.google.android.gms.backup.BackupAccountManagerService"), new ahml(this, account), 1)) {
            return;
        }
        j.f("Cannot connect to BackupAccountManagerService.", new Object[0]);
        finish();
    }

    public final void h(Account account) {
        SetBackupAccountChimeraActivity setBackupAccountChimeraActivity = k().b;
        String stringExtra = setBackupAccountChimeraActivity.getIntent().getStringExtra("photosBackupAccountName");
        Bundle bundle = new Bundle();
        bundle.putParcelable("new_backup_account", account);
        bundle.putString("photos_backup_account_name", stringExtra);
        ahlu ahluVar = new ahlu();
        ahluVar.setArguments(bundle);
        ahluVar.x(setBackupAccountChimeraActivity.getSupportFragmentManager());
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        List a = aidc.a(this);
        if (a.isEmpty()) {
            j.j("No accounts for backup on device, launching add account", new Object[0]);
            setTheme(android.R.style.Theme.Translucent.NoTitleBar);
            super.onCreate(bundle);
            c();
            return;
        }
        if (this.m == null) {
            this.m = new aiey(new asmf(1, 9), this);
        }
        super.onCreate(bundle);
        Account[] accountArr = new Account[a.size()];
        this.l = accountArr;
        Account[] accountArr2 = (Account[]) a.toArray(accountArr);
        this.l = accountArr2;
        int length = accountArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int length2 = this.l[i].name.length();
            int i4 = length2 > i3 ? length2 : i3;
            if (length2 > i3) {
                i2 = i;
            }
            i++;
            i3 = i4;
        }
        if (i2 != 0) {
            Account[] accountArr3 = this.l;
            Account account = accountArr3[0];
            accountArr3[0] = accountArr3[i2];
            accountArr3[i2] = account;
        }
        String[] strArr = new String[length + 1];
        for (int i5 = 0; i5 < length; i5++) {
            strArr[i5] = aicy.a(this.l[i5], this);
        }
        strArr[length] = getResources().getString(R.string.common_add_account);
        setContentView(R.layout.set_backup_account);
        Drawable drawable = getResources().getDrawable(2131232803);
        Drawable drawable2 = getResources().getDrawable(2131233082);
        drawable2.setColorFilter(getColor(R.color.account_menu_line_item_tint), PorterDuff.Mode.SRC_IN);
        TextView textView = (TextView) findViewById(android.R.id.title);
        textView.setLayoutDirection(2);
        textView.setSingleLine(false);
        textView.setMaxLines(2);
        ListView listView = (ListView) findViewById(android.R.id.list);
        final ahmm ahmmVar = new ahmm(this, this, strArr, drawable, drawable2);
        listView.setAdapter((ListAdapter) ahmmVar);
        listView.setChoiceMode(1);
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ahmj
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i6, long j2) {
                int count = ((ListView) adapterView).getCount() - 1;
                SetBackupAccountChimeraActivity setBackupAccountChimeraActivity = SetBackupAccountChimeraActivity.this;
                if (i6 == count) {
                    setBackupAccountChimeraActivity.c();
                } else {
                    setBackupAccountChimeraActivity.g(setBackupAccountChimeraActivity.l[i6]);
                }
            }
        });
        Iterator it = a.iterator();
        while (it.hasNext()) {
            this.m.c((Account) it.next(), new Runnable() { // from class: ahmk
                @Override // java.lang.Runnable
                public final void run() {
                    final ahmm ahmmVar2 = ahmmVar;
                    Objects.requireNonNull(ahmmVar2);
                    SetBackupAccountChimeraActivity.this.runOnUiThread(new Runnable() { // from class: ahmi
                        @Override // java.lang.Runnable
                        public final void run() {
                            ahmm.this.notifyDataSetChanged();
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        j.d("#onStart", new Object[0]);
        super.onStart();
        Account account = (Account) this.k.getAndSet(null);
        if (account != null) {
            h(account);
        }
    }
}
