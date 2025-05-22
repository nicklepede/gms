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
import defpackage.ajlz;
import defpackage.ajmf;
import defpackage.ajmj;
import defpackage.ajmk;
import defpackage.ajnb;
import defpackage.ajnc;
import defpackage.ajrv;
import defpackage.ajtm;
import defpackage.ajts;
import defpackage.ajwt;
import defpackage.ajwz;
import defpackage.ajxc;
import defpackage.ajxi;
import defpackage.akdo;
import defpackage.akds;
import defpackage.akeu;
import defpackage.akfo;
import defpackage.auad;
import defpackage.aumo;
import defpackage.aupz;
import defpackage.aury;
import defpackage.bp;
import defpackage.bsup;
import defpackage.dhkz;
import defpackage.dhlk;
import defpackage.dhln;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dymf;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elgo;
import defpackage.emuw;
import defpackage.emux;
import defpackage.emvn;
import defpackage.euyj;
import defpackage.euyl;
import defpackage.evlx;
import defpackage.evly;
import defpackage.evmj;
import defpackage.evmk;
import defpackage.evmp;
import defpackage.evmq;
import defpackage.evmr;
import defpackage.evne;
import defpackage.evnf;
import defpackage.evnz;
import defpackage.evoa;
import defpackage.evoe;
import defpackage.evoi;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fhql;
import defpackage.ryt;
import defpackage.wic;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SetBackupAccountChimeraActivity extends ryt implements ajmj {
    public static final ajwt j = new ajwt("SetBackupAccountChimeraActivity");
    public akfo m;
    public final AtomicReference k = new AtomicReference();
    public Account[] l = null;
    private final ekww n = ekxd.a(new ekww() { // from class: ajmw
        @Override // defpackage.ekww
        public final Object lK() {
            return new akeu(SetBackupAccountChimeraActivity.this);
        }
    });
    private final AccountManagerCallback o = new AccountManagerCallback() { // from class: ajmx
        @Override // android.accounts.AccountManagerCallback
        public final void run(AccountManagerFuture accountManagerFuture) {
            SetBackupAccountChimeraActivity.this.f(accountManagerFuture);
        }
    };

    private final ajmf k() {
        ajxc ajxcVar = new ajxc(this, new aupz(3, 9));
        akeu akeuVar = (akeu) this.n.lK();
        aupz aupzVar = new aupz(3, 9);
        auad auadVar = ajtm.a;
        return new ajmf(this, new ajtm(this, aupzVar, new akeu(this), elgo.l(new ajts(this))), ajxcVar, akeuVar);
    }

    private final void l() {
        if (isFinishing() || !akds.a(this).isEmpty()) {
            return;
        }
        setResult(0);
        finish();
    }

    private final boolean m() {
        return getIntent().getBooleanExtra("showConfirmationDialogOnAccountChange", false);
    }

    @Override // defpackage.ajmj
    public final void a(Account account) {
        ajmf k = k();
        int b = k.b(account);
        fgrc v = emvn.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        emvn emvnVar = (emvn) fgriVar;
        emvnVar.c = 2;
        emvnVar.b |= 1;
        if (!fgriVar.L()) {
            v.U();
        }
        emvn emvnVar2 = (emvn) v.b;
        emvnVar2.d = b - 1;
        emvnVar2.b |= 2;
        emvn emvnVar3 = (emvn) v.Q();
        fgrc c = ajwz.c();
        if (!c.b.L()) {
            c.U();
        }
        akeu akeuVar = k.e;
        emux emuxVar = (emux) c.b;
        emux emuxVar2 = emux.a;
        emvnVar3.getClass();
        emuxVar.at = emvnVar3;
        emuxVar.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        akeuVar.z(c, emuw.BACKUP_ACCOUNT_CHANGE_EVENT, 0);
        finish();
    }

    @Override // defpackage.ajmj
    public final void b(final Account account) {
        final ajmf k = k();
        SetBackupAccountChimeraActivity setBackupAccountChimeraActivity = k.b;
        View findViewById = setBackupAccountChimeraActivity.findViewById(R.id.set_backup_account_root);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        bp bpVar = new bp(setBackupAccountChimeraActivity.getSupportFragmentManager());
        bpVar.E(ajlz.class, ajlz.class.getName());
        bpVar.d();
        Account account2 = (Account) setBackupAccountChimeraActivity.getIntent().getParcelableExtra("currentBackupAccount");
        if (account2 == null) {
            ajmf.a.g("Null value for current backup account", new IllegalStateException("Current backup account is null"), new Object[0]);
            return;
        }
        String stringExtra = setBackupAccountChimeraActivity.getIntent().getStringExtra("photosBackupAccountName");
        String str = account.name;
        setBackupAccountChimeraActivity.getIntent().getStringExtra("photosBackupAccountName");
        fgrc v = evoi.a.v();
        euyj euyjVar = euyj.M;
        if (!v.b.L()) {
            v.U();
        }
        evoi evoiVar = (evoi) v.b;
        evoiVar.c = euyjVar.a();
        evoiVar.b |= 1;
        fgrc v2 = evlx.a.v();
        evmk evmkVar = evmk.a;
        evmj evmjVar = (evmj) evmkVar.v();
        evmjVar.k(R.string.change_backup_account_dialog_title);
        if (!v2.b.L()) {
            v2.U();
        }
        evlx evlxVar = (evlx) v2.b;
        evmk evmkVar2 = (evmk) evmjVar.Q();
        evmkVar2.getClass();
        evlxVar.d = evmkVar2;
        evlxVar.b |= 2;
        evmj evmjVar2 = (evmj) evmkVar.v();
        evmjVar2.k(R.string.common_confirm);
        if (!v2.b.L()) {
            v2.U();
        }
        evlx evlxVar2 = (evlx) v2.b;
        evmk evmkVar3 = (evmk) evmjVar2.Q();
        evmkVar3.getClass();
        evlxVar2.f = evmkVar3;
        evlxVar2.b |= 8;
        evmj evmjVar3 = (evmj) evmkVar.v();
        evmjVar3.k(R.string.common_cancel);
        if (!v2.b.L()) {
            v2.U();
        }
        evlx evlxVar3 = (evlx) v2.b;
        evmk evmkVar4 = (evmk) evmjVar3.Q();
        evmkVar4.getClass();
        evlxVar3.g = evmkVar4;
        evlxVar3.b |= 16;
        evmj evmjVar4 = (evmj) evmkVar.v();
        evmjVar4.k(R.string.change_backup_account_dialog_text_for_other_device_data);
        boolean z = stringExtra == null;
        if (stringExtra != null) {
            if (stringExtra.equals(str)) {
                evmjVar4.k(R.string.change_backup_account_dialog_text_for_photos_same_account);
            } else {
                evmjVar4.k(R.string.change_backup_account_dialog_text_for_photos);
            }
        }
        if (((Boolean) k.f.lK()).booleanValue()) {
            evmjVar4.k(R.string.change_backup_account_dialog_text_for_android_messages);
        }
        if (!v2.b.L()) {
            v2.U();
        }
        evlx evlxVar4 = (evlx) v2.b;
        evmk evmkVar5 = (evmk) evmjVar4.Q();
        evmkVar5.getClass();
        evlxVar4.e = evmkVar5;
        evlxVar4.b |= 4;
        fgrc v3 = evoe.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        evoe evoeVar = (evoe) v3.b;
        evlx evlxVar5 = (evlx) v2.Q();
        evlxVar5.getClass();
        evoeVar.e = evlxVar5;
        evoeVar.b |= 1;
        evoe evoeVar2 = (evoe) v3.Q();
        if (!v.b.L()) {
            v.U();
        }
        evoi evoiVar2 = (evoi) v.b;
        evoeVar2.getClass();
        evoiVar2.d = evoeVar2;
        evoiVar2.b |= 8;
        evoi evoiVar3 = (evoi) v.Q();
        evnz evnzVar = (evnz) evoa.a.v();
        evnzVar.a(12);
        evoa evoaVar = (evoa) evnzVar.Q();
        fgrc v4 = evly.a.v();
        if (!v4.b.L()) {
            v4.U();
        }
        boolean z2 = !z;
        fgri fgriVar = v4.b;
        evly evlyVar = (evly) fgriVar;
        evlyVar.b |= 2;
        evlyVar.d = z2;
        if (!fgriVar.L()) {
            v4.U();
        }
        evly evlyVar2 = (evly) v4.b;
        evlyVar2.b |= 1;
        evlyVar2.c = true;
        evly evlyVar3 = (evly) v4.Q();
        fgrc v5 = evnf.a.v();
        if (!v5.b.L()) {
            v5.U();
        }
        fgri fgriVar2 = v5.b;
        evnf evnfVar = (evnf) fgriVar2;
        evoaVar.getClass();
        evnfVar.t = evoaVar;
        evnfVar.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        if (!fgriVar2.L()) {
            v5.U();
        }
        evnf evnfVar2 = (evnf) v5.b;
        evlyVar3.getClass();
        evnfVar2.f = evlyVar3;
        evnfVar2.b |= 1;
        evnf evnfVar3 = (evnf) v5.Q();
        fgrc v6 = evne.a.v();
        euyl euylVar = euyl.ANDROID_BACKUP_SET_ACCOUNT;
        if (!v6.b.L()) {
            v6.U();
        }
        fgri fgriVar3 = v6.b;
        evne evneVar = (evne) fgriVar3;
        evneVar.c = euylVar.lK;
        evneVar.b |= 1;
        if (!fgriVar3.L()) {
            v6.U();
        }
        evne evneVar2 = (evne) v6.b;
        evnfVar3.getClass();
        evneVar2.d = evnfVar3;
        evneVar2.b |= 2;
        evne evneVar3 = (evne) v6.Q();
        final evmr c = ParcelableSession.b().c();
        ajxc ajxcVar = k.d;
        final String str2 = account2.name;
        String str3 = account.name;
        auad auadVar = ajxc.a;
        auadVar.j("record account switching consent", new Object[0]);
        final evmp evmpVar = (evmp) evmq.a.v();
        if (!evmpVar.b.L()) {
            evmpVar.U();
        }
        evmq evmqVar = (evmq) evmpVar.b;
        evneVar3.getClass();
        evmqVar.f = evneVar3;
        evmqVar.b |= 4;
        if (!evmpVar.b.L()) {
            evmpVar.U();
        }
        evmq evmqVar2 = (evmq) evmpVar.b;
        evoiVar3.getClass();
        evmqVar2.g = evoiVar3;
        evmqVar2.b |= 8;
        auadVar.j(((evmq) evmpVar.Q()).toString(), new Object[0]);
        final wic wicVar = ajxcVar.f;
        Context context = ajxcVar.e;
        Executor executor = ajxcVar.d;
        final dhlw b = ajxi.b(context, str2);
        final dhlw b2 = ajxi.b(context, str3);
        dhlw e = dhmr.h(b, b2).e(executor, new dhkz() { // from class: ajxg
            @Override // defpackage.dhkz
            public final Object a(dhlw dhlwVar) {
                ekut ekutVar = ajxi.a;
                dhlw dhlwVar2 = dhlw.this;
                String str4 = dhlwVar2.m() ? (String) dhlwVar2.i() : null;
                dhlw dhlwVar3 = b2;
                String str5 = dhlwVar3.m() ? (String) dhlwVar3.i() : null;
                evmp evmpVar2 = evmpVar;
                if (str4 != null) {
                    fgrc v7 = evmy.a.v();
                    if (!v7.b.L()) {
                        v7.U();
                    }
                    evmy evmyVar = (evmy) v7.b;
                    evmyVar.b = 1;
                    evmyVar.c = str4;
                    evmy evmyVar2 = (evmy) v7.Q();
                    fgrc v8 = evnb.a.v();
                    if (!v8.b.L()) {
                        v8.U();
                    }
                    evnb evnbVar = (evnb) v8.b;
                    evmyVar2.getClass();
                    evnbVar.c = evmyVar2;
                    evnbVar.b |= 1;
                    evnb evnbVar2 = (evnb) v8.Q();
                    if (!evmpVar2.b.L()) {
                        evmpVar2.U();
                    }
                    evmq evmqVar3 = (evmq) evmpVar2.b;
                    evmq evmqVar4 = evmq.a;
                    evnbVar2.getClass();
                    evmqVar3.d = evnbVar2;
                    evmqVar3.b |= 1;
                }
                if (str5 != null) {
                    fgrc v9 = evmy.a.v();
                    if (!v9.b.L()) {
                        v9.U();
                    }
                    evmy evmyVar3 = (evmy) v9.b;
                    evmyVar3.b = 1;
                    evmyVar3.c = str5;
                    evmy evmyVar4 = (evmy) v9.Q();
                    fgrc v10 = evnb.a.v();
                    evmx f = ajxi.f();
                    if (!v10.b.L()) {
                        v10.U();
                    }
                    fgri fgriVar4 = v10.b;
                    evnb evnbVar3 = (evnb) fgriVar4;
                    f.getClass();
                    evnbVar3.d = f;
                    evnbVar3.b |= 4;
                    if (!fgriVar4.L()) {
                        v10.U();
                    }
                    evnb evnbVar4 = (evnb) v10.b;
                    evmyVar4.getClass();
                    evnbVar4.c = evmyVar4;
                    evnbVar4.b |= 1;
                    evnb evnbVar5 = (evnb) v10.Q();
                    if (!evmpVar2.b.L()) {
                        evmpVar2.U();
                    }
                    evmq evmqVar5 = (evmq) evmpVar2.b;
                    evmq evmqVar6 = evmq.a;
                    evnbVar5.getClass();
                    evmqVar5.e = evnbVar5;
                    evmqVar5.b |= 2;
                }
                return ajxi.e(wicVar, evmpVar2, str2, c);
            }
        });
        e.y(new dhln() { // from class: ajxb
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ajxc.a.g("Exception writing audit record for account switching", exc, new Object[0]);
            }
        });
        e.x(new dhlk() { // from class: ajmd
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                ajmf ajmfVar = ajmf.this;
                Account account3 = account;
                ajme ajmeVar = new ajme(ajmfVar, account3);
                akaq a = akar.a();
                a.c(15);
                ajmfVar.c.d(account3, ajmeVar, null, a.a());
            }
        });
    }

    public final void c() {
        bsup.b(this).s(true != aury.c(this) ? "com.google" : "cn.google", null, getContainerActivity(), this.o, null);
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
            ajwt r3 = com.google.android.gms.backup.base.SetBackupAccountChimeraActivity.j     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            boolean r4 = r3.b(r1)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
            if (r4 == 0) goto L1d
            java.lang.String r4 = "account added: "
            java.lang.String r4 = defpackage.a.N(r7, r4)     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
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
            ajmu r7 = new ajmu     // Catch: java.io.IOException -> L59 android.accounts.AuthenticatorException -> L5b android.accounts.OperationCanceledException -> L6f
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
            ajwt r0 = com.google.android.gms.backup.base.SetBackupAccountChimeraActivity.j
            boolean r1 = r0.b(r1)
            if (r1 == 0) goto L6b
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "addAccount failed: "
            r0.k(r2, r7, r1)
        L6b:
            r6.l()
            return
        L6f:
            ajwt r7 = com.google.android.gms.backup.base.SetBackupAccountChimeraActivity.j
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
        if (ajrv.a()) {
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
            if (ajrv.a()) {
                intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.EnhancedBackupOptInActivity");
                dymf.d(intent, fhql.OTHER_BACKUP_SETTINGS);
                dymf.d(intent, fhql.BACKUP_SETTINGS_ACCOUNT_CHANGE);
            } else {
                intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.SetBackupAccountFlowActivity");
                intent.putExtra("turnOff", getIntent().getBooleanExtra("turnOff", false));
                intent.putExtra("showDone", getIntent().getBooleanExtra("showDone", false));
            }
            startActivity(intent);
            finish();
            return;
        }
        evmp evmpVar = (evmp) evmq.a.v();
        fgrc v = evne.a.v();
        euyl euylVar = euyl.ANDROID_BACKUP_SET_ACCOUNT;
        if (!v.b.L()) {
            v.U();
        }
        evne evneVar = (evne) v.b;
        evneVar.c = euylVar.lK;
        evneVar.b |= 1;
        evnz evnzVar = (evnz) evoa.a.v();
        evnzVar.a(12);
        evoa evoaVar = (evoa) evnzVar.Q();
        fgrc v2 = evnf.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        evnf evnfVar = (evnf) v2.b;
        evoaVar.getClass();
        evnfVar.t = evoaVar;
        evnfVar.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        evnf evnfVar2 = (evnf) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        evne evneVar2 = (evne) v.b;
        evnfVar2.getClass();
        evneVar2.d = evnfVar2;
        evneVar2.b |= 2;
        if (!evmpVar.b.L()) {
            evmpVar.U();
        }
        evmq evmqVar = (evmq) evmpVar.b;
        evne evneVar3 = (evne) v.Q();
        evneVar3.getClass();
        evmqVar.f = evneVar3;
        evmqVar.b |= 4;
        fgrc v3 = evoi.a.v();
        euyj euyjVar = euyj.W;
        if (!v3.b.L()) {
            v3.U();
        }
        evoi evoiVar = (evoi) v3.b;
        evoiVar.c = euyjVar.a();
        evoiVar.b |= 1;
        if (!evmpVar.b.L()) {
            evmpVar.U();
        }
        evmq evmqVar2 = (evmq) evmpVar.b;
        evoi evoiVar2 = (evoi) v3.Q();
        evoiVar2.getClass();
        evmqVar2.g = evoiVar2;
        evmqVar2.b |= 8;
        ajxi.c(getApplicationContext(), evmpVar, account).x(new dhlk() { // from class: ajmv
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                ajwt ajwtVar = SetBackupAccountChimeraActivity.j;
                if (dhlwVar.m()) {
                    return;
                }
                SetBackupAccountChimeraActivity.j.g("Exception writing audit record", dhlwVar.h(), new Object[0]);
            }
        });
        if (aumo.a().d(this, new Intent().setClassName(this, "com.google.android.gms.backup.BackupAccountManagerService"), new ajnb(this, account), 1)) {
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
        ajmk ajmkVar = new ajmk();
        ajmkVar.setArguments(bundle);
        ajmkVar.x(setBackupAccountChimeraActivity.getSupportFragmentManager());
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        List a = akds.a(this);
        if (a.isEmpty()) {
            j.j("No accounts for backup on device, launching add account", new Object[0]);
            setTheme(android.R.style.Theme.Translucent.NoTitleBar);
            super.onCreate(bundle);
            c();
            return;
        }
        if (this.m == null) {
            this.m = new akfo(new aupz(1, 9), this);
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
            strArr[i5] = akdo.a(this.l[i5], this);
        }
        strArr[length] = getResources().getString(R.string.common_add_account);
        setContentView(R.layout.set_backup_account);
        Drawable drawable = getResources().getDrawable(2131232867);
        Drawable drawable2 = getResources().getDrawable(2131233147);
        drawable2.setColorFilter(getColor(R.color.account_menu_line_item_tint), PorterDuff.Mode.SRC_IN);
        TextView textView = (TextView) findViewById(android.R.id.title);
        textView.setLayoutDirection(2);
        textView.setSingleLine(false);
        textView.setMaxLines(2);
        ListView listView = (ListView) findViewById(android.R.id.list);
        final ajnc ajncVar = new ajnc(this, this, strArr, drawable, drawable2);
        listView.setAdapter((ListAdapter) ajncVar);
        listView.setChoiceMode(1);
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ajmz
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
            this.m.c((Account) it.next(), new Runnable() { // from class: ajna
                @Override // java.lang.Runnable
                public final void run() {
                    final ajnc ajncVar2 = ajncVar;
                    Objects.requireNonNull(ajncVar2);
                    SetBackupAccountChimeraActivity.this.runOnUiThread(new Runnable() { // from class: ajmy
                        @Override // java.lang.Runnable
                        public final void run() {
                            ajnc.this.notifyDataSetChanged();
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStart() {
        j.d("#onStart", new Object[0]);
        super.onStart();
        Account account = (Account) this.k.getAndSet(null);
        if (account != null) {
            h(account);
        }
    }
}
