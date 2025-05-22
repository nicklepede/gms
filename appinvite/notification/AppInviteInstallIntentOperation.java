package com.google.android.gms.appinvite.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.atwh;
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.bzpt;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.enei;
import defpackage.enes;
import defpackage.enex;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fjch;
import defpackage.vst;
import defpackage.vsu;
import defpackage.vtc;
import defpackage.vtm;
import defpackage.vxi;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppInviteInstallIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("AppInstallOperation", auid.APP_INVITE);
    private vsu b;
    private bsxr c;

    public AppInviteInstallIntentOperation() {
        this.b = null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if (this.b == null) {
            this.b = new vsu(null);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        auio auioVar = auio.FDL_APPINVITE_INSTALL_INTENT_OPERATION;
        if (this.c == null) {
            ekww ekwwVar = bsxv.a;
            this.c = new bsxr();
        }
        bsxr.a(auioVar);
        String action = intent.getAction();
        if (Objects.equals(action, "android.intent.action.PACKAGE_ADDED") || Objects.equals(action, "android.intent.action.PACKAGE_FULLY_REMOVED")) {
            String action2 = intent.getAction();
            Uri data = intent.getData();
            String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            if (TextUtils.isEmpty(schemeSpecificPart)) {
                ((eluo) a.i()).x("Package name not found in the intent.");
                return;
            }
            if (vxi.l(this, schemeSpecificPart)) {
                if (action2.equals("android.intent.action.PACKAGE_FULLY_REMOVED")) {
                    vxi.j(this, schemeSpecificPart);
                    return;
                }
                if (vxi.k("loggerInstallEvent", true, this, schemeSpecificPart)) {
                    return;
                }
                vxi.o("loggerInstallEvent", this, schemeSpecificPart);
                vsu vsuVar = this.b;
                int p = vxi.p(this, schemeSpecificPart);
                int i = true != vxi.k("isInlineInstall", false, this, schemeSpecificPart) ? 2 : 3;
                boolean k = vxi.k("launchFromContinueUrl", false, this, schemeSpecificPart);
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                String f = vxi.f(this, schemeSpecificPart);
                int a2 = fjch.a(vxi.a(this, schemeSpecificPart));
                String d = vxi.d(this, schemeSpecificPart);
                String e = vxi.e(this, schemeSpecificPart);
                String h = vxi.h(this, schemeSpecificPart);
                fgrc v = enei.a.v();
                if (TextUtils.isEmpty(schemeSpecificPart)) {
                    z = true;
                } else {
                    fgrc v2 = enex.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    enex enexVar = (enex) v2.b;
                    schemeSpecificPart.getClass();
                    z = true;
                    enexVar.b |= 2;
                    enexVar.c = schemeSpecificPart;
                    if (!v.b.L()) {
                        v.U();
                    }
                    enei eneiVar = (enei) v.b;
                    enex enexVar2 = (enex) v2.Q();
                    enexVar2.getClass();
                    eneiVar.c = enexVar2;
                    eneiVar.b |= 1;
                }
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                enei eneiVar2 = (enei) fgriVar;
                eneiVar2.d = p - 1;
                eneiVar2.b |= 2;
                if (!fgriVar.L()) {
                    v.U();
                }
                fgri fgriVar2 = v.b;
                enei eneiVar3 = (enei) fgriVar2;
                eneiVar3.e = i - 1;
                eneiVar3.b |= 4;
                if (!fgriVar2.L()) {
                    v.U();
                }
                enei eneiVar4 = (enei) v.b;
                eneiVar4.b |= 8;
                eneiVar4.f = k;
                if (!TextUtils.isEmpty(d) || !TextUtils.isEmpty(e)) {
                    enes c = vsu.c(d, e, f, a2, "");
                    if (!v.b.L()) {
                        v.U();
                    }
                    enei eneiVar5 = (enei) v.b;
                    c.getClass();
                    eneiVar5.g = c;
                    eneiVar5.b |= 32;
                }
                int d2 = vsu.d(z, booleanExtra);
                if (!v.b.L()) {
                    v.U();
                }
                enei eneiVar6 = (enei) v.b;
                eneiVar6.h = d2 - 1;
                eneiVar6.b |= 64;
                vsuVar.f((enei) v.Q(), 11, h);
                atwh atwhVar = new atwh();
                atwhVar.a = getApplicationInfo().uid;
                atwhVar.d = getPackageName();
                atwhVar.e = getPackageName();
                try {
                    new vtm(atwhVar, vtc.a(this), new vst(this), vxi.i("invitationId", this, schemeSpecificPart), null).f(this);
                } catch (RemoteException | bzpt e2) {
                    ((eluo) ((eluo) a.i()).s(e2)).x("Failed to complete invitation.");
                }
            }
        }
    }

    public AppInviteInstallIntentOperation(Context context, vsu vsuVar) {
        this.b = null;
        attachBaseContext(context);
        this.b = vsuVar;
    }
}
