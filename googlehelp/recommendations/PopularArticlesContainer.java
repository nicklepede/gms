package com.google.android.gms.googlehelp.recommendations;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer;
import com.google.android.material.button.MaterialButton;
import defpackage.bkuk;
import defpackage.bkvj;
import defpackage.bkvq;
import defpackage.bkzz;
import defpackage.blfl;
import defpackage.blfz;
import defpackage.frgg;
import defpackage.frgy;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PopularArticlesContainer extends LinearLayout {
    public HelpChimeraActivity a;
    public List b;
    public bkvj c;
    public boolean d;
    public int e;

    public PopularArticlesContainer(Context context) {
        this(context, null);
    }

    public static final void c(HelpChimeraActivity helpChimeraActivity, int i, String str) {
        if (bkzz.b(frgy.d())) {
            blfl.s(helpChimeraActivity, i, str, "", 0);
        }
    }

    public static final void d(HelpChimeraActivity helpChimeraActivity, int i, String str) {
        blfz.s(helpChimeraActivity, i, str, 0, "", null);
    }

    final void a(boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.gh_browse_all_articles_title);
        if (materialButton != null) {
            if (!z) {
                materialButton.setVisibility(8);
            } else {
                materialButton.setVisibility(0);
                materialButton.setOnClickListener(new View.OnClickListener() { // from class: blih
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PopularArticlesContainer popularArticlesContainer = PopularArticlesContainer.this;
                        popularArticlesContainer.a.S();
                        PopularArticlesContainer.c(popularArticlesContainer.a, 15, popularArticlesContainer.c.g);
                        PopularArticlesContainer.d(popularArticlesContainer.a, 30, popularArticlesContainer.c.g);
                        blki.k(popularArticlesContainer.a, popularArticlesContainer.c, 30, 0);
                    }
                });
            }
        }
    }

    public final void b() {
        HelpChimeraActivity helpChimeraActivity = this.a;
        if (helpChimeraActivity == null) {
            return;
        }
        HelpConfig helpConfig = helpChimeraActivity.W;
        bkuk bkukVar = bkuk.d;
        String j = helpConfig.j(bkukVar);
        if (TextUtils.isEmpty(j)) {
            Uri uri = helpConfig.s;
            j = uri != null ? uri.toString() : bkukVar.y;
        }
        bkvj bkvjVar = this.c;
        if (bkvjVar != null && bkvjVar.g.equals(j)) {
            if (helpConfig.y() || !this.d) {
                return;
            }
            c(this.a, 14, this.c.g);
            d(this.a, 27, this.c.g);
            return;
        }
        bkvj j2 = TextUtils.isEmpty(j) ? null : bkvj.j(j, bkvq.a(), helpConfig);
        this.c = j2;
        if (j2 == null || bkzz.b(frgg.c()) || helpConfig.E()) {
            a(false);
            return;
        }
        a(true);
        if (helpConfig.y() || !this.d) {
            return;
        }
        c(this.a, 14, this.c.g);
        d(this.a, 27, this.c.g);
    }

    public PopularArticlesContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        LayoutInflater.from(context).inflate(R.layout.gh_popular_articles_content_gm3, (ViewGroup) this, true);
    }
}
