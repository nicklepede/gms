package com.google.android.gms.nearby.sharing.send;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a;
import defpackage.chkv;
import defpackage.colj;
import defpackage.comx;
import defpackage.cqqt;
import defpackage.cqqu;
import defpackage.csum;
import defpackage.csvf;
import defpackage.csxy;
import defpackage.csxz;
import defpackage.csya;
import defpackage.csyb;
import defpackage.cszd;
import defpackage.ctcx;
import defpackage.ctdh;
import defpackage.ctej;
import defpackage.cteq;
import defpackage.ctsm;
import defpackage.ctss;
import defpackage.flml;
import defpackage.ftgf;
import defpackage.ftgi;
import defpackage.fvp;
import defpackage.fxqo;
import defpackage.fxqu;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.fyfr;
import defpackage.fyfw;
import defpackage.iwv;
import defpackage.jxm;
import defpackage.jxw;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SendChimeraActivity extends csum {
    public final boolean f = ftgf.a.lK().aF();
    public ctcx g;
    public flml h;
    public fxqo i;
    public colj j;
    private final fxqu k;

    public SendChimeraActivity() {
        csxz csxzVar = new csxz(this);
        int i = fxya.a;
        this.k = new jxm(new fxxg(cteq.class), new csya(this), csxzVar, new csyb(this));
    }

    public final colj b() {
        colj coljVar = this.j;
        if (coljVar != null) {
            return coljVar;
        }
        fxxm.j("analyticsLogger");
        return null;
    }

    public final ctcx c() {
        ctcx ctcxVar = this.g;
        if (ctcxVar != null) {
            return ctcxVar;
        }
        fxxm.j("sendScreenPresenter");
        return null;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        fxxm.f(str, "prefix");
        fxxm.f(printWriter, "writer");
        int intValue = (ftgi.d() ? ((ctej) i()).a() : fxxm.n(getIntent().getAction(), "android.intent.action.REMOTE_COPY") ? 1 : 0).intValue();
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.write(str);
        printWriter.write("SendActivity\n");
        printWriter.write(str);
        printWriter.write("  UI State: ");
        printWriter.write(((ctdh) c().e.b()).toString());
        printWriter.write("\n");
        printWriter.write(str);
        Uri referrer = getReferrer();
        printWriter.write(a.a(referrer != null ? referrer.getHost() : null, "  Referrer package name: ", "\n"));
        printWriter.write(str);
        switch (intValue) {
            case 0:
                str2 = "NEARBY_SHARE";
                break;
            case 1:
                str2 = "REMOTE_COPY";
                break;
            case 2:
                str2 = "WIFI_CREDENTIAL";
                break;
            case 3:
                str2 = "APP_SHARE";
                break;
            case 4:
                str2 = "QUICK_SETTING_FILE_SHARE";
                break;
            case 5:
                str2 = "SETUP_WIZARD";
                break;
            case 6:
                str2 = "NEARBY_SHARE_WITH_QR_CODE";
                break;
            case 7:
                str2 = "REDIRECTED_FROM_BLUETOOTH_SHARE";
                break;
            default:
                str2 = a.l(intValue, "UNKNOWN[", "]");
                break;
        }
        printWriter.write(a.a(str2, "  Usecase: ", "\n"));
        printWriter.flush();
    }

    public final cteq f() {
        return (cteq) this.k.a();
    }

    public final fxqo i() {
        fxqo fxqoVar = this.i;
        if (fxqoVar != null) {
            return fxqoVar;
        }
        fxxm.j("sendUseCase");
        return null;
    }

    @Override // defpackage.csum, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        fxxm.e(intent, "getIntent(...)");
        Intent a = cqqu.a(this, intent, cqqt.b);
        if (a != null) {
            startActivity(a);
            finish();
            return;
        }
        if (ftgf.J()) {
            flml flmlVar = this.h;
            if (flmlVar == null) {
                fxxm.j("sendHatsMixin");
                flmlVar = null;
            }
            flmlVar.a();
        }
        comx.b(this);
        iwv.a(getWindow(), false);
        ctsm ctsmVar = new ctsm(new ctss(this, chkv.f()));
        getOnBackPressedDispatcher().a(new csvf(this));
        colj f = colj.f(this);
        fxxm.f(f, "<set-?>");
        this.j = f;
        if (ftgf.H() && bundle == null) {
            cteq f2 = f();
            Intent intent2 = getIntent();
            fxxm.e(intent2, "getIntent(...)");
            f2.c(intent2);
        }
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fvp(-868794470, true, new csxy(this, ctsmVar, composeView)));
        setContentView(composeView);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        fxxm.f(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        if (ftgf.H()) {
            f().c(intent);
        }
        if (ftgf.J()) {
            jxw jxwVar = new jxw(this);
            int i = fxya.a;
            cszd cszdVar = (cszd) jxwVar.b(new fxxg(cszd.class));
            Object andSet = cszdVar.a.getAndSet(cszdVar.b());
            fxxm.e(andSet, "getAndSet(...)");
            fyfw.e((fyfr) andSet, "new intent", null);
        }
    }
}
