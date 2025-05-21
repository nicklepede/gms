package com.google.android.gms.nearby.sharing.send;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a;
import defpackage.cfdj;
import defpackage.cmdb;
import defpackage.cmep;
import defpackage.cohy;
import defpackage.cohz;
import defpackage.cqli;
import defpackage.cqmb;
import defpackage.cqou;
import defpackage.cqov;
import defpackage.cqow;
import defpackage.cqox;
import defpackage.cqpz;
import defpackage.cqtt;
import defpackage.cqud;
import defpackage.cqvf;
import defpackage.cqvm;
import defpackage.crji;
import defpackage.crjo;
import defpackage.fiwo;
import defpackage.fqmk;
import defpackage.fqmn;
import defpackage.fuuq;
import defpackage.fuuw;
import defpackage.fuy;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.fvjt;
import defpackage.fvjy;
import defpackage.ivf;
import defpackage.jqx;
import defpackage.jrh;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SendChimeraActivity extends cqli {
    public final boolean f = fqmk.a.a().aJ();
    public cqtt g;
    public fiwo h;
    public fuuq i;
    public cmdb j;
    private final fuuw k;

    public SendChimeraActivity() {
        cqov cqovVar = new cqov(this);
        int i = fvcc.a;
        this.k = new jqx(new fvbi(cqvm.class), new cqow(this), cqovVar, new cqox(this));
    }

    public final cmdb b() {
        cmdb cmdbVar = this.j;
        if (cmdbVar != null) {
            return cmdbVar;
        }
        fvbo.j("analyticsLogger");
        return null;
    }

    public final cqtt c() {
        cqtt cqttVar = this.g;
        if (cqttVar != null) {
            return cqttVar;
        }
        fvbo.j("sendScreenPresenter");
        return null;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        fvbo.f(str, "prefix");
        fvbo.f(printWriter, "writer");
        int intValue = (fqmn.d() ? ((cqvf) i()).a() : fvbo.n(getIntent().getAction(), "android.intent.action.REMOTE_COPY") ? 1 : 0).intValue();
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.write(str);
        printWriter.write("SendActivity\n");
        printWriter.write(str);
        printWriter.write("  UI State: ");
        printWriter.write(((cqud) c().e.b()).toString());
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

    public final cqvm f() {
        return (cqvm) this.k.a();
    }

    public final fuuq i() {
        fuuq fuuqVar = this.i;
        if (fuuqVar != null) {
            return fuuqVar;
        }
        fvbo.j("sendUseCase");
        return null;
    }

    @Override // defpackage.cqli, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        fvbo.e(intent, "getIntent(...)");
        Intent a = cohz.a(this, intent, cohy.b);
        if (a != null) {
            startActivity(a);
            finish();
            return;
        }
        if (fqmk.J()) {
            fiwo fiwoVar = this.h;
            if (fiwoVar == null) {
                fvbo.j("sendHatsMixin");
                fiwoVar = null;
            }
            fiwoVar.a();
        }
        cmep.b(this);
        ivf.a(getWindow(), false);
        crji crjiVar = new crji(new crjo(this, cfdj.f()));
        getOnBackPressedDispatcher().a(new cqmb(this));
        cmdb f = cmdb.f(this);
        fvbo.f(f, "<set-?>");
        this.j = f;
        if (fqmk.H() && bundle == null) {
            cqvm f2 = f();
            Intent intent2 = getIntent();
            fvbo.e(intent2, "getIntent(...)");
            f2.c(intent2);
        }
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fuy(-868794470, true, new cqou(this, crjiVar, composeView)));
        setContentView(composeView);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        fvbo.f(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        if (fqmk.H()) {
            f().c(intent);
        }
        if (fqmk.J()) {
            jrh jrhVar = new jrh(this);
            int i = fvcc.a;
            cqpz cqpzVar = (cqpz) jrhVar.b(new fvbi(cqpz.class));
            Object andSet = cqpzVar.a.getAndSet(cqpzVar.b());
            fvbo.e(andSet, "getAndSet(...)");
            fvjy.e((fvjt) andSet, "new intent", null);
        }
    }
}
