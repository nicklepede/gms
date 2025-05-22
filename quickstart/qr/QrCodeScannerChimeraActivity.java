package com.google.android.gms.quickstart.qr;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import com.google.android.gms.quickstart.qr.QrCodeScannerChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import defpackage.atmo;
import defpackage.auad;
import defpackage.aupz;
import defpackage.aury;
import defpackage.ausk;
import defpackage.aye;
import defpackage.ayh;
import defpackage.czhw;
import defpackage.czhx;
import defpackage.czio;
import defpackage.cziu;
import defpackage.cziv;
import defpackage.czjd;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.elgo;
import defpackage.elqm;
import defpackage.elso;
import defpackage.fmya;
import defpackage.fukt;
import defpackage.fuya;
import defpackage.fvak;
import defpackage.ijy;
import defpackage.ikj;
import defpackage.ind;
import defpackage.rxx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class QrCodeScannerChimeraActivity extends rxx implements cziv {
    public static final auad j = new auad("QuickStart", "QrCodeScannerActivity");
    public cziu k;
    public czio l;
    private final ausk m = new ausk() { // from class: czix
        @Override // defpackage.ausk
        public final Object a(Object obj) {
            return new czio((Context) obj);
        }
    };
    private HashSet n = elqm.i("https://signin.google");
    private String o;
    private String p;
    private String q;
    private String r;
    private boolean s;

    private final String l(Intent intent, String str, int i) {
        String str2 = null;
        if (intent != null && intent.hasExtra(str)) {
            str2 = intent.getStringExtra(str);
        }
        return TextUtils.isEmpty(str2) ? getString(i) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cziv
    public final void a(List list) {
        VibrationEffect createOneShot;
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            elso it2 = ((elgo) list).iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (str2.startsWith(str)) {
                    if (checkPermission("android.permission.VIBRATE", Process.myPid(), Process.myUid()) == 0) {
                        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
                        if (Build.VERSION.SDK_INT >= 26) {
                            createOneShot = VibrationEffect.createOneShot(250L, -1);
                            vibrator.vibrate(createOneShot);
                        } else {
                            vibrator.vibrate(250L);
                        }
                    }
                    Intent intent = new Intent();
                    intent.putExtra("qr-code-contents", str2);
                    k(-1, intent);
                    return;
                }
            }
        }
    }

    public final void k(int i, Intent intent) {
        j.d("finishWithResult: %d", Integer.valueOf(i));
        cziu cziuVar = this.k;
        if (cziuVar != null) {
            if (cziuVar.a()) {
                cziu.a.m("startDetecting() called but lifecycle is destroyed", new Object[0]);
            } else {
                synchronized (cziuVar.c) {
                    cziu.a.j("stopDetecting()", new Object[0]);
                    cziuVar.k = null;
                }
                aye ayeVar = cziuVar.g;
                synchronized (ayeVar.a) {
                    ayh ayhVar = ayeVar.b;
                    if (ayhVar != null) {
                        ayhVar.f(null, null);
                    }
                    if (ayeVar.d != null) {
                        ayeVar.J();
                    }
                    ayeVar.c = null;
                    ayeVar.d = null;
                }
            }
        }
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        new AlertDialog.Builder(this).setTitle(this.o).setMessage(this.p).setNegativeButton(this.r, new DialogInterface.OnClickListener() { // from class: czja
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                QrCodeScannerChimeraActivity.this.k(5001, null);
            }
        }).setPositiveButton(this.q, new DialogInterface.OnClickListener() { // from class: czjb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                auad auadVar = QrCodeScannerChimeraActivity.j;
                dialogInterface.dismiss();
            }
        }).show();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        ArrayList<String> stringArrayListExtra;
        View o;
        View o2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        setRequestedOrientation(1);
        super.onCreate(bundle);
        auad auadVar = j;
        auadVar.d("onCreate()", new Object[0]);
        if (fmya.c()) {
            atmo.a(this);
        }
        czhx.a(this);
        if (fuya.g()) {
            setContentView(R.layout.quickstart_qr_code_scanner_layout_v2);
        } else {
            setContentView(R.layout.quickstart_qr_code_scanner_layout);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.preview_view_container);
        linearLayout.setOutlineProvider(new czjd());
        linearLayout.setClipToOutline(true);
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.glif_layout);
        if (glifLayout != null) {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                if (glifLayout.ha() && (o2 = glifLayout.o(R.id.sud_layout_content)) != null && (o2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) o2.getLayoutParams()) != null) {
                    marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
                }
            } else if (i == 2 && (o = glifLayout.o(R.id.sud_layout_content)) != null) {
                o.setPadding(o.getPaddingLeft(), 0, o.getPaddingRight(), o.getPaddingBottom());
            }
        }
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("url-prefixes") && (stringArrayListExtra = intent.getStringArrayListExtra("url-prefixes")) != null) {
            this.n = new HashSet(stringArrayListExtra);
        }
        GlifLayout glifLayout2 = (GlifLayout) findViewById(R.id.glif_layout);
        String b = czhw.b(this);
        String stringExtra = intent.getStringExtra("scanner-title");
        if (stringExtra != null) {
            b = stringExtra;
        }
        glifLayout2.b(b);
        glifLayout2.G(czhw.a(this));
        this.o = l(intent, "cancel-dialog-title", R.string.quickstart_qr_code_scanner_exit_title);
        fukt fuktVar = fukt.a;
        this.p = l(intent, "cancel-dialog-message", true != fuktVar.lK().e() ? R.string.quickstart_qr_code_scanner_exit_description : R.string.quickstart_qr_code_scanner_exit_detailed_description);
        this.q = l(intent, "positive-button-text", R.string.common_try_again);
        this.r = l(intent, "negative-button-text", R.string.common_cancel);
        if (intent != null) {
            this.s = intent.getBooleanExtra("pin-fallback-supported", false);
        }
        if (!fukt.c().isEmpty()) {
            String c = fukt.c();
            auadVar.h("Returning fake QR code contents: %s", c);
            Intent intent2 = new Intent();
            intent2.putExtra("qr-code-contents", c);
            k(-1, intent2);
            return;
        }
        final czio czioVar = (czio) this.m.a(this);
        this.l = czioVar;
        new aupz(1, 9).submit(new Callable() { // from class: czin
            @Override // java.util.concurrent.Callable
            public final Object call() {
                czio czioVar2 = czio.this;
                boolean g = ausq.g(czioVar2.b, "barhopper_qr_only_jni");
                synchronized (czioVar2.a) {
                    czioVar2.d.set(g);
                }
                return null;
            }
        }).hD(new Runnable() { // from class: cziy
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00a5, code lost:
            
                r3 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x00a9, code lost:
            
                throw r3;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 343
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cziy.run():void");
            }
        }, ind.g(this));
        if (fuktVar.lK().d()) {
            efsl efslVar = (efsl) ((GlifLayout) findViewById(R.id.glif_layout)).q(efsl.class);
            efsm efsmVar = new efsm(this);
            efsmVar.b(R.string.common_cancel);
            efsmVar.b = new View.OnClickListener() { // from class: cziw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QrCodeScannerChimeraActivity.j.d("onAction() with actionId: %d", Integer.valueOf(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
                    QrCodeScannerChimeraActivity.this.onBackPressed();
                }
            };
            efslVar.c(efsmVar.a());
        }
        if (fvak.o() && this.s) {
            auadVar.d("setupPinFallbackEntryPoint()", new Object[0]);
            GlifLayout glifLayout3 = (GlifLayout) findViewById(R.id.glif_layout);
            Button button = (Button) glifLayout3.findViewById(R.id.pin_fallback);
            button.setOnClickListener(new View.OnClickListener() { // from class: cziz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QrCodeScannerChimeraActivity.this.k(5003, null);
                }
            });
            button.setVisibility(0);
            if (fuktVar.lK().b() && getResources().getConfiguration().orientation == 2 && aury.l(this)) {
                auadVar.d("Adjusting layout for Pixel landscape mode", new Object[0]);
                ConstraintLayout constraintLayout = (ConstraintLayout) glifLayout3.findViewById(R.id.constraint_layout);
                ikj ikjVar = new ikj();
                ikjVar.e(constraintLayout);
                ikjVar.d(R.id.preview_view_container, 4);
                ikjVar.c(constraintLayout);
                ijy ijyVar = (ijy) ((LinearLayout) glifLayout3.findViewById(R.id.preview_view_container)).getLayoutParams();
                if (ijyVar != null) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.quickstart_qr_code_scanner_landscape_padding_horizontal);
                    ijyVar.topMargin = getResources().getDimensionPixelSize(R.dimen.quickstart_qr_code_scanner_landscape_top_margin);
                    ijyVar.leftMargin = dimensionPixelSize;
                    ijyVar.rightMargin = dimensionPixelSize;
                }
            }
        }
    }
}
