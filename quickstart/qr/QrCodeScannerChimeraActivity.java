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
import defpackage.arjz;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.asoe;
import defpackage.asoq;
import defpackage.axv;
import defpackage.axy;
import defpackage.cwxy;
import defpackage.cwxz;
import defpackage.cwyq;
import defpackage.cwyw;
import defpackage.cwyx;
import defpackage.cwzf;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.eitj;
import defpackage.ejdf;
import defpackage.ejfh;
import defpackage.fkhl;
import defpackage.frql;
import defpackage.fsdd;
import defpackage.fsfn;
import defpackage.iii;
import defpackage.iit;
import defpackage.iln;
import defpackage.qet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class QrCodeScannerChimeraActivity extends qet implements cwyx {
    public static final arxo j = new arxo("QuickStart", "QrCodeScannerActivity");
    public cwyw k;
    public cwyq l;
    private final asoq m = new asoq() { // from class: cwyz
        @Override // defpackage.asoq
        public final Object a(Object obj) {
            return new cwyq((Context) obj);
        }
    };
    private HashSet n = ejdf.i("https://signin.google");
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
    @Override // defpackage.cwyx
    public final void a(List list) {
        VibrationEffect createOneShot;
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ejfh it2 = ((eitj) list).iterator();
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
        cwyw cwywVar = this.k;
        if (cwywVar != null) {
            if (cwywVar.a()) {
                cwyw.a.m("startDetecting() called but lifecycle is destroyed", new Object[0]);
            } else {
                synchronized (cwywVar.c) {
                    cwyw.a.j("stopDetecting()", new Object[0]);
                    cwywVar.k = null;
                }
                axv axvVar = cwywVar.g;
                synchronized (axvVar.a) {
                    axy axyVar = axvVar.b;
                    if (axyVar != null) {
                        axyVar.f(null, null);
                    }
                    if (axvVar.d != null) {
                        axvVar.J();
                    }
                    axvVar.c = null;
                    axvVar.d = null;
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

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        new AlertDialog.Builder(this).setTitle(this.o).setMessage(this.p).setNegativeButton(this.r, new DialogInterface.OnClickListener() { // from class: cwzc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                QrCodeScannerChimeraActivity.this.k(5001, null);
            }
        }).setPositiveButton(this.q, new DialogInterface.OnClickListener() { // from class: cwzd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                arxo arxoVar = QrCodeScannerChimeraActivity.j;
                dialogInterface.dismiss();
            }
        }).show();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        ArrayList<String> stringArrayListExtra;
        View o;
        View o2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        setRequestedOrientation(1);
        super.onCreate(bundle);
        arxo arxoVar = j;
        arxoVar.d("onCreate()", new Object[0]);
        if (fkhl.c()) {
            arjz.a(this);
        }
        cwxz.a(this);
        if (fsdd.g()) {
            setContentView(R.layout.quickstart_qr_code_scanner_layout_v2);
        } else {
            setContentView(R.layout.quickstart_qr_code_scanner_layout);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.preview_view_container);
        linearLayout.setOutlineProvider(new cwzf());
        linearLayout.setClipToOutline(true);
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.glif_layout);
        if (glifLayout != null) {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                if (glifLayout.gK() && (o2 = glifLayout.o(R.id.sud_layout_content)) != null && (o2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) o2.getLayoutParams()) != null) {
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
        String b = cwxy.b(this);
        String stringExtra = intent.getStringExtra("scanner-title");
        if (stringExtra != null) {
            b = stringExtra;
        }
        glifLayout2.b(b);
        glifLayout2.G(cwxy.a(this));
        this.o = l(intent, "cancel-dialog-title", R.string.quickstart_qr_code_scanner_exit_title);
        frql frqlVar = frql.a;
        this.p = l(intent, "cancel-dialog-message", true != frqlVar.a().e() ? R.string.quickstart_qr_code_scanner_exit_description : R.string.quickstart_qr_code_scanner_exit_detailed_description);
        this.q = l(intent, "positive-button-text", R.string.common_try_again);
        this.r = l(intent, "negative-button-text", R.string.common_cancel);
        if (intent != null) {
            this.s = intent.getBooleanExtra("pin-fallback-supported", false);
        }
        if (!frql.c().isEmpty()) {
            String c = frql.c();
            arxoVar.h("Returning fake QR code contents: %s", c);
            Intent intent2 = new Intent();
            intent2.putExtra("qr-code-contents", c);
            k(-1, intent2);
            return;
        }
        final cwyq cwyqVar = (cwyq) this.m.a(this);
        this.l = cwyqVar;
        new asmf(1, 9).submit(new Callable() { // from class: cwyp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cwyq cwyqVar2 = cwyq.this;
                boolean g = asow.g(cwyqVar2.b, "barhopper_qr_only_jni");
                synchronized (cwyqVar2.a) {
                    cwyqVar2.d.set(g);
                }
                return null;
            }
        }).hn(new Runnable() { // from class: cwza
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwza.run():void");
            }
        }, iln.g(this));
        if (frql.a.a().d()) {
            edfq edfqVar = (edfq) ((GlifLayout) findViewById(R.id.glif_layout)).q(edfq.class);
            edfr edfrVar = new edfr(this);
            edfrVar.b(R.string.common_cancel);
            edfrVar.b = new View.OnClickListener() { // from class: cwyy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QrCodeScannerChimeraActivity.j.d("onAction() with actionId: %d", Integer.valueOf(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
                    QrCodeScannerChimeraActivity.this.onBackPressed();
                }
            };
            edfqVar.c(edfrVar.a());
        }
        if (fsfn.o() && this.s) {
            arxoVar.d("setupPinFallbackEntryPoint()", new Object[0]);
            GlifLayout glifLayout3 = (GlifLayout) findViewById(R.id.glif_layout);
            Button button = (Button) glifLayout3.findViewById(R.id.pin_fallback);
            button.setOnClickListener(new View.OnClickListener() { // from class: cwzb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QrCodeScannerChimeraActivity.this.k(5003, null);
                }
            });
            button.setVisibility(0);
            if (frqlVar.a().b() && getResources().getConfiguration().orientation == 2 && asoe.l(this)) {
                arxoVar.d("Adjusting layout for Pixel landscape mode", new Object[0]);
                ConstraintLayout constraintLayout = (ConstraintLayout) glifLayout3.findViewById(R.id.constraint_layout);
                iit iitVar = new iit();
                iitVar.e(constraintLayout);
                iitVar.d(R.id.preview_view_container, 4);
                iitVar.c(constraintLayout);
                iii iiiVar = (iii) ((LinearLayout) glifLayout3.findViewById(R.id.preview_view_container)).getLayoutParams();
                if (iiiVar != null) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.quickstart_qr_code_scanner_landscape_padding_horizontal);
                    iiiVar.topMargin = getResources().getDimensionPixelSize(R.dimen.quickstart_qr_code_scanner_landscape_top_margin);
                    iiiVar.leftMargin = dimensionPixelSize;
                    iiiVar.rightMargin = dimensionPixelSize;
                }
            }
        }
    }
}
