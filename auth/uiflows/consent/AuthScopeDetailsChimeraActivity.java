package com.google.android.gms.auth.uiflows.consent;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.auqy;
import defpackage.aury;
import defpackage.ryr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthScopeDetailsChimeraActivity extends ryr implements View.OnClickListener, View.OnTouchListener {
    public static final /* synthetic */ int h = 0;
    private String i;
    private Intent j;
    private ScrollView k;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.ok) {
            this.j.putExtra("detail_end_time", System.currentTimeMillis());
            if (this.k.getHeight() < this.k.getChildAt(0).getMeasuredHeight()) {
                this.j.putExtra("detail_screen_scrollable", true);
            } else {
                this.j.putExtra("scroll_screen_end", true);
            }
            setResult(-1, this.j);
            finish();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.auth_consent_scope_details_activity);
        Intent intent = new Intent();
        this.j = intent;
        intent.putExtra("detail_start_time", System.currentTimeMillis());
        this.i = getIntent().getStringExtra("scope_details");
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview_details);
        this.k = scrollView;
        scrollView.setOnTouchListener(this);
        String str = this.i;
        if (str != null) {
            Spanned fromHtml = Html.fromHtml(str.replaceAll("\n", "<br/>"));
            TextView textView = (TextView) findViewById(R.id.scope_details_text);
            textView.setText(fromHtml);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setClickable(true);
        } else {
            ((TextView) findViewById(R.id.scope_details_text)).setText((CharSequence) null);
        }
        ((Button) findViewById(R.id.ok)).setOnClickListener(this);
        auqy.b(getContainerActivity(), aury.n(getResources()) ? r5.getDimension(R.dimen.plus_auth_dialog_tablet_resize_factor) : r5.getDimension(R.dimen.plus_auth_dialog_resize_factor));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() == R.id.scrollview_details && view.getHeight() + view.getScrollY() == this.k.getChildAt(0).getMeasuredHeight()) {
            this.j.putExtra("scroll_screen_end", true);
        }
        return false;
    }
}
