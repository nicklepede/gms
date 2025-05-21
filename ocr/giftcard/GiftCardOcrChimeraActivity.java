package com.google.android.gms.ocr.giftcard;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.ocr.GiftCardOcrResult;
import com.google.android.gms.ocr.giftcard.GiftCardOcrChimeraActivity;
import defpackage.arxd;
import defpackage.bp;
import defpackage.csfz;
import defpackage.csgu;
import defpackage.csgv;
import defpackage.csjj;
import defpackage.csjm;
import defpackage.dg;
import defpackage.fqoi;
import defpackage.fqol;
import defpackage.qet;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GiftCardOcrChimeraActivity extends qet implements csgv {
    csjj j;
    public int k;
    private csjm l;
    private int m;
    private int n;
    private String o;
    private int p;

    @Override // defpackage.csgv
    public final csgu a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.inflate(R.layout.ocr_code_capture, viewGroup, true);
        viewGroup.findViewById(R.id.ocrRegionOfInterest).setContentDescription(this.o);
        final ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.gift_card_add_manually_button);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: csjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftCardOcrChimeraActivity giftCardOcrChimeraActivity = GiftCardOcrChimeraActivity.this;
                giftCardOcrChimeraActivity.k++;
                imageButton.setEnabled(false);
                giftCardOcrChimeraActivity.setResult(10007, giftCardOcrChimeraActivity.k());
                giftCardOcrChimeraActivity.finish();
            }
        });
        GradientDrawable gradientDrawable = (GradientDrawable) imageButton.getBackground();
        gradientDrawable.setColor(this.n);
        gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.keyboard_button_stroke_width), this.m);
        final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ocrRegionOfInterest);
        return new csgu() { // from class: csjo
            @Override // defpackage.csgu
            public final ViewGroup a() {
                return viewGroup2;
            }
        };
    }

    @Override // defpackage.csgv
    public final void b() {
        if (fqol.c()) {
            return;
        }
        this.j.D();
    }

    @Override // defpackage.csgv
    public final void d() {
        setResult(10003);
        finish();
    }

    @Override // defpackage.csgv
    public final void e(List list) {
        if (list == null || list.isEmpty()) {
            setResult(10006);
        } else if (list.get(0) != null) {
            csfz a = ((GiftCardOcrResult) list.get(0)).a();
            a.a(this.k, this.p);
            GiftCardOcrResult giftCardOcrResult = new GiftCardOcrResult(a);
            Intent intent = new Intent();
            arxd.l(giftCardOcrResult, intent, "com.google.android.gms.ocr.GIFT_CARD_OCR_RESULT");
            List list2 = giftCardOcrResult.a;
            if (list2 == null || list2.isEmpty()) {
                setResult(10006, intent);
            } else {
                setResult(-1, intent);
            }
        }
        finish();
    }

    public final Intent k() {
        csfz csfzVar = new csfz();
        csfzVar.a(this.k, this.p);
        csjj csjjVar = this.j;
        if (csjjVar != null) {
            csjjVar.J(csfzVar);
        }
        Intent intent = new Intent();
        arxd.l(new GiftCardOcrResult(csfzVar), intent, "com.google.android.gms.ocr.GIFT_CARD_OCR_RESULT");
        return intent;
    }

    @Override // defpackage.qfw
    public final void onAttachFragment(dg dgVar) {
        if (dgVar instanceof csjj) {
            csjj csjjVar = (csjj) dgVar;
            this.l.b(csjjVar);
            csjjVar.x(this, false);
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        setResult(0, k());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.l = new csjm(this, getIntent().getExtras());
        setTheme(R.style.Theme_GiftCard);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.google.android.gms.ocr.TITLE");
        this.o = intent.getStringExtra("com.google.android.gms.ocr.CODE_WINDOW_LABEL");
        this.m = intent.getIntExtra("com.google.android.gms.ocr.KEYBOARD_BUTTON_STROKE_COLOR", getResources().getColor(android.R.color.white));
        this.n = intent.getIntExtra("com.google.android.gms.ocr.KEYBOARD_BUTTON_BACKGROUND_COLOR", getResources().getColor(android.R.color.black));
        setTitle(stringExtra);
        if (!fqoi.c()) {
            getWindow().addFlags(8192);
        }
        hy().o(true);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        } else if (getResources().getConfiguration().orientation != 1) {
            Toast.makeText(this, R.string.ocr_rotate_device, 1).show();
            return;
        }
        csjj csjjVar = (csjj) getSupportFragmentManager().h("GiftCardFragment");
        this.j = csjjVar;
        if (bundle == null || csjjVar == null) {
            csjj csjjVar2 = new csjj();
            this.j = csjjVar2;
            csjjVar2.setArguments(getIntent().getExtras());
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.u(android.R.id.content, this.j, "GiftCardFragment");
            bpVar.a();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.p++;
        onBackPressed();
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        csjj csjjVar;
        if (fqol.c() && (csjjVar = this.j) != null) {
            csjjVar.F();
        }
        super.onPause();
    }

    @Override // defpackage.qfw
    protected final void onResumeFragments() {
        csjj csjjVar;
        super.onResumeFragments();
        if (!fqol.c() || (csjjVar = this.j) == null) {
            return;
        }
        csjjVar.B();
    }

    @Override // defpackage.csgv
    public final void c() {
    }
}
