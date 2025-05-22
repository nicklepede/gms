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
import defpackage.atzs;
import defpackage.bp;
import defpackage.cupe;
import defpackage.cupz;
import defpackage.cuqa;
import defpackage.cuso;
import defpackage.cusr;
import defpackage.dg;
import defpackage.ftif;
import defpackage.ftii;
import defpackage.rxx;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GiftCardOcrChimeraActivity extends rxx implements cuqa {
    cuso j;
    public int k;
    private cusr l;
    private int m;
    private int n;
    private String o;
    private int p;

    @Override // defpackage.cuqa
    public final cupz a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.inflate(R.layout.ocr_code_capture, viewGroup, true);
        viewGroup.findViewById(R.id.ocrRegionOfInterest).setContentDescription(this.o);
        final ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.gift_card_add_manually_button);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: cuss
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
        return new cupz() { // from class: cust
            @Override // defpackage.cupz
            public final ViewGroup a() {
                return viewGroup2;
            }
        };
    }

    @Override // defpackage.cuqa
    public final void b() {
        if (ftii.c()) {
            return;
        }
        this.j.D();
    }

    @Override // defpackage.cuqa
    public final void d() {
        setResult(10003);
        finish();
    }

    @Override // defpackage.cuqa
    public final void e(List list) {
        if (list == null || list.isEmpty()) {
            setResult(10006);
        } else if (list.get(0) != null) {
            cupe a = ((GiftCardOcrResult) list.get(0)).a();
            a.a(this.k, this.p);
            GiftCardOcrResult giftCardOcrResult = new GiftCardOcrResult(a);
            Intent intent = new Intent();
            atzs.l(giftCardOcrResult, intent, "com.google.android.gms.ocr.GIFT_CARD_OCR_RESULT");
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
        cupe cupeVar = new cupe();
        cupeVar.a(this.k, this.p);
        cuso cusoVar = this.j;
        if (cusoVar != null) {
            cusoVar.J(cupeVar);
        }
        Intent intent = new Intent();
        atzs.l(new GiftCardOcrResult(cupeVar), intent, "com.google.android.gms.ocr.GIFT_CARD_OCR_RESULT");
        return intent;
    }

    @Override // defpackage.rza
    public final void onAttachFragment(dg dgVar) {
        if (dgVar instanceof cuso) {
            cuso cusoVar = (cuso) dgVar;
            this.l.b(cusoVar);
            cusoVar.x(this, false);
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        setResult(0, k());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.l = new cusr(this, getIntent().getExtras());
        setTheme(R.style.Theme_GiftCard);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.google.android.gms.ocr.TITLE");
        this.o = intent.getStringExtra("com.google.android.gms.ocr.CODE_WINDOW_LABEL");
        this.m = intent.getIntExtra("com.google.android.gms.ocr.KEYBOARD_BUTTON_STROKE_COLOR", getResources().getColor(android.R.color.white));
        this.n = intent.getIntExtra("com.google.android.gms.ocr.KEYBOARD_BUTTON_BACKGROUND_COLOR", getResources().getColor(android.R.color.black));
        setTitle(stringExtra);
        if (!ftif.c()) {
            getWindow().addFlags(8192);
        }
        hO().o(true);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        } else if (getResources().getConfiguration().orientation != 1) {
            Toast.makeText(this, R.string.ocr_rotate_device, 1).show();
            return;
        }
        cuso cusoVar = (cuso) getSupportFragmentManager().h("GiftCardFragment");
        this.j = cusoVar;
        if (bundle == null || cusoVar == null) {
            cuso cusoVar2 = new cuso();
            this.j = cusoVar2;
            cusoVar2.setArguments(getIntent().getExtras());
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.u(android.R.id.content, this.j, "GiftCardFragment");
            bpVar.a();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.p++;
        onBackPressed();
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        cuso cusoVar;
        if (ftii.c() && (cusoVar = this.j) != null) {
            cusoVar.F();
        }
        super.onPause();
    }

    @Override // defpackage.rza
    protected final void onResumeFragments() {
        cuso cusoVar;
        super.onResumeFragments();
        if (!ftii.c() || (cusoVar = this.j) == null) {
            return;
        }
        cusoVar.B();
    }

    @Override // defpackage.cuqa
    public final void c() {
    }
}
